/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SRC;

import junit.framework.TestCase;

/**
 *
 * @author M S I
 */
public class DictionaryTest extends TestCase {
    
    public DictionaryTest(String testName) {
        super(testName);
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of buildLexicon method, of class Dictionary.
     */
    public void testBuildLexicon() {
        System.out.println("buildLexicon");
        String text = "";
        Dictionary instance = new Dictionary();
        instance.buildLexicon(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasWord method, of class Dictionary.
     */
    public void testHasWord() {
        System.out.println("hasWord");
        String word = "";
        Dictionary instance = new Dictionary();
        boolean expResult = false;
        boolean result = instance.hasWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWord method, of class Dictionary.
     */
    public void testAddWord() {
        System.out.println("addWord");
        String word = "";
        Dictionary instance = new Dictionary();
        instance.addWord(word);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
