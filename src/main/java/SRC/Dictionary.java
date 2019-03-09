/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SRC;

/**
 *
 * @author M S I
 */

import java.util.HashMap;
import java.io.*;
public class Dictionary {
    HashMap<String,Number> Lexicon;
    
    void buildLexicon(String text){
        int length = text.length();
        int start = 0;
        for(int i=0;i<length;i++){       
            if(text.charAt(i)=='\n'){
                String word = new String(text.substring(start,i));
                this.addWord(word);
                start = i+1;
            }
        }
    }
    Dictionary(){Lexicon = new HashMap<>();};
    
    Dictionary(String path){
        try {
            Lexicon = new HashMap<>();
            File file = new File(path);
            if(file.isFile() && file.exists()) {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
                BufferedReader br = new BufferedReader(isr);
                String lineTxt = "";
                while ((lineTxt = br.readLine()) != null) {
                    addWord(lineTxt);
                }
                br.close();
            } else {
            System.out.println("文件不存在!");
            }
        }
        catch (Exception e) {
            System.out.println("文件读取错误!");
        }
    }
    
    boolean hasWord(String word){
        return Lexicon.containsKey(word);
    }
    void addWord(String word){
        Lexicon.put(word, 1);
    }
}
