/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.ex1;

import java.util.Iterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class TreeTest {
    
    public TreeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of addElement method, of class Tree.
     */
    @Test
    public void testAddElement() throws Exception {
        Tree<String> tree = new Tree<>();
        tree.addElement("b", 2);
        tree.addElement("a", 1);
        assertTrue(tree.elementExist("a"));
        assertTrue(tree.elementExist("b"));
        assertFalse(tree.elementExist("c"));
    }
    
    /**
     * Test of addElement method, of class Tree.
     */
    @Test(expected = AlreadyExistException.class)
    public void testAddElementException() throws Exception {
        Tree<String> tree = new Tree<>();
        tree.addElement("a", 1);
        tree.addElement("a", 1);
    }


    /**
     * Test of elementExist method, of class Tree.
     */
    @Test
    public void testElementExist() throws AlreadyExistException{
        Tree<String> tree = new Tree<>();
        tree.addElement("a", 1);
        assertTrue(tree.elementExist("a"));
        assertFalse(tree.elementExist("b"));
        tree.addElement("b", 2);
        assertTrue(tree.elementExist("b"));
    }

}