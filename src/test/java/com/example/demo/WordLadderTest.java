/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo;

import java.util.ArrayDeque;
import java.util.Stack;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M S I
 */
public class WordLadderTest {
    
    public WordLadderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class WordLadder.
     *
     * /

    /**
     * Test of ladder method, of class WordLadder.
     */
    @org.junit.Test
    public void testLadder() {
        System.out.println("ladder");
        ArrayDeque<Stack<String>> paths = new ArrayDeque<>();
        Stack<String> ladder = new Stack<>();
        ladder.push("cat");
        paths.addFirst(ladder);
        String des = "bat";
        Dictionary chosen = new Dictionary();
        Dictionary lexicon = new Dictionary();
        lexicon.addWord("bat");
        WordLadder instance = new WordLadder();
        Stack expResult = new Stack();
        expResult.push("cat");
        expResult.push("bat");
        Stack result = instance.ladder(paths, des, chosen, lexicon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of NewWord method, of class WordLadder.
     */
    @org.junit.Test
    public void testNewWord() {
        System.out.println("NewWord");
        int j = 0;
        String frontWord = "cat";
        int wordLength = 3;
        char c = 'b';
        WordLadder instance = new WordLadder();
        String expResult = "bat";
        String result = instance.NewWord(j, frontWord, wordLength, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of newLadder method, of class WordLadder.
     */
    @org.junit.Test
    public void testNewLadder() {
        System.out.println("newLadder");
        String newWord = "bat";
        Stack<String> Ladder = new Stack<>();
        Ladder.push("cat");
        WordLadder instance = new WordLadder();
        Stack<String> expResult = new Stack<>();
        expResult.push("cat");
        expResult.push("bat");
        Stack<String> result = instance.newLadder(newWord, Ladder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of printResult method, of class WordLadder.
     */
    @org.junit.Test
    public void testPrintResult() {
        System.out.println("printResult");
        Stack<String> ladder = new Stack<>();
        ladder.push("bat");
        ladder.push("cat");
        Stack<String> expResult = new Stack<>();
        expResult.push("cat");
        expResult.push("bat");

        WordLadder instance = new WordLadder();
        instance.printResult(ladder);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult,instance.path);
    }
    
}
