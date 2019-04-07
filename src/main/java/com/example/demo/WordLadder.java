/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo;

import java.util.Stack;
import java.util.ArrayDeque;
/**
 *
 * @author M S I
 */

        
public class WordLadder {
    Stack<String> path;
    /*public static void main(String[] arguments){
        try{
            WordLadder w = new WordLadder();
            String start,end;
            if(arguments.length<3) 
                throw new Exception("Argument error.");
            Dictionary lexicon = new Dictionary(arguments[0]);
            start = arguments[1];
            end = arguments[2];
            Dictionary chosen = new Dictionary();
            chosen.buildLexicon(start);
            Stack<String> ladder = new Stack<>(),result=null;
            ladder.push(start);
            ArrayDeque<Stack<String>> paths = new ArrayDeque<>();
            paths.add(ladder);
            result = w.ladder(paths,end,chosen,lexicon);
            if(result!=null){
                w.printResult(result);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    WordLadder(){path = new Stack<>();}

    Stack<String> ladder(ArrayDeque<Stack<String>> paths, String des, Dictionary chosen,Dictionary lexicon){
        Stack<String> topLadder,newLadder;
        ArrayDeque<Stack<String>> newPaths = new ArrayDeque<>();
        boolean changed = false;
        while(!paths.isEmpty()){
            topLadder = paths.pollFirst();
            String frontWord = topLadder.peek(), newWord;
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int wordLength = frontWord.length();
            for(int i=0;i<26;i++){
                for(int j=0;j<wordLength;j++){
                    char c = alphabet.charAt(i);
                    newWord = NewWord(j,frontWord,wordLength,c);
                    if(!chosen.hasWord(newWord)&& lexicon.hasWord(newWord)){
                        changed = true;
                        newLadder = newLadder(newWord,topLadder);
                        if(newWord.equals(des)){
                            return newLadder;
                        }
                        else{
                            newPaths.addLast(newLadder);
                            chosen.addWord(newWord);
                        }
                    }
                }
            }
        }
        if(changed) return ladder(newPaths,des,chosen,lexicon);
        else return null;
    }
    
    String NewWord(int j, String frontWord, int wordLength, char c){
        String newWord = new String();
        if(j==0){
            newWord = c + frontWord.substring(1);
        }
        else{
            if(j == wordLength - 1) 
                newWord = frontWord.substring(0,j) + c;
            else 
                newWord = frontWord.substring(0,j) + c + frontWord.substring(j+1);
        }
        return newWord;
    }
    
    Stack<String> newLadder(String newWord, Stack<String> Ladder){
        Stack<String> newLadder = new Stack<>();
        newLadder.addAll(Ladder);
        newLadder.push(newWord);
        return newLadder;
    }

    void printResult(Stack<String> ladder){  // Changed only to to fit in in the unit tests.
        while(!ladder.isEmpty()){
            path.push(ladder.pop());
        }
        Stack<String> output = new Stack<>();
        output.addAll(path);
        System.out.print(output.pop());
        while(!output.isEmpty()){
            System.out.print("->"+ output.pop());
        }
        System.out.print("\n");
    }
    String LadderToString(Stack<String> ladder){
        Stack<String> reverse = new Stack<>();
        while(!ladder.isEmpty()){
            reverse.push(ladder.pop());
        }
        String output;
        StringBuffer buf = new StringBuffer();
        buf.append(reverse.pop());
        while(!reverse.empty()){
            buf.append("->");
            buf.append(reverse.pop());
        }
        output = buf.toString();
        return output;
    }
}
