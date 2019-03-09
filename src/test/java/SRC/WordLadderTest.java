/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SRC;

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
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] arguments = null;
        WordLadder.main(arguments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ladder method, of class WordLadder.
     */
    @org.junit.Test
    public void testLadder() {
        System.out.println("ladder");
        ArrayDeque<Stack<String>> paths = null;
        String des = "";
        Dictionary chosen = null;
        Dictionary lexicon = null;
        WordLadder instance = new WordLadder();
        Stack expResult = null;
        Stack result = instance.ladder(paths, des, chosen, lexicon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NewWord method, of class WordLadder.
     */
    @org.junit.Test
    public void testNewWord() {
        System.out.println("NewWord");
        int j = 0;
        String frontWord = "";
        int wordLength = 0;
        char c = ' ';
        WordLadder instance = new WordLadder();
        String expResult = "";
        String result = instance.NewWord(j, frontWord, wordLength, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newLadder method, of class WordLadder.
     */
    @org.junit.Test
    public void testNewLadder() {
        System.out.println("newLadder");
        String newWord = "";
        Stack<String> Ladder = null;
        WordLadder instance = new WordLadder();
        Stack<String> expResult = null;
        Stack<String> result = instance.newLadder(newWord, Ladder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printResult method, of class WordLadder.
     */
    @org.junit.Test
    public void testPrintResult() {
        System.out.println("printResult");
        Stack<String> ladder = null;
        WordLadder instance = new WordLadder();
        instance.printResult(ladder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
