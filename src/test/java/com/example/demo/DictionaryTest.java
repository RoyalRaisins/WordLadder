/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        String text = "bat\n";
        Dictionary instance = new Dictionary();
        instance.buildLexicon(text);
        assertEquals(true,instance.Lexicon.containsKey("bat"));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hasWord method, of class Dictionary.
     */
    public void testHasWord() {
        System.out.println("hasWord");
        String word = "bat";
        Dictionary instance = new Dictionary();
        instance.Lexicon.put(word,1);
        boolean expResult = true;
        boolean result = instance.hasWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addWord method, of class Dictionary.
     */
    public void testAddWord() {
        System.out.println("addWord");
        String word = "bat";
        Dictionary instance = new Dictionary();
        instance.addWord(word);
        if(!instance.hasWord("bat"))
        // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
    }

    /**
    * LadderController Tester.
    *
    * @author <Authors name>
    * @since <pre>四月 13, 2019</pre>
    * @version 1.0
    */
    public static class LadderControllerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: Ladder(ModelAndView modelAndView)
    *
    */
    @Test
    public void testLadderModelAndView() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: Ladder(ModelAndView modelAndView, @Valid RequestVo requestVo, BindingResult bindingResult)
    *
    */
    @Test
    public void testLadderForModelAndViewRequestVoBindingResult() throws Exception {
    //TODO: Test goes here...
    }


    }
}
