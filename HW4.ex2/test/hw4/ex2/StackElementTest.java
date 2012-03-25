/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class StackElementTest {
    
    public StackElementTest() {
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
     * Test of getValue method, of class StackElement.
     */
    @Test
    public void testGetValue() {
        StackElement current = new StackElement(test1);
        assertEquals(test1, current.getValue());
    }

    /**
     * Test of setNewValue method, of class StackElement.
     */
    @Test
    public void testSetNewValue() {
        StackElement current = new StackElement(test1);
        assertEquals(test1, current.getValue());
        current.setNewValue(test2);
        assertEquals(test2, current.getValue());
    }

    /**
     * Test of setNewNext method, of class StackElement.
     */
    @Test
    public void testSetNewNext() {
        StackElement current = new StackElement(test1);
        StackElement help = new StackElement(test2);
        current.setNewNext(help);
        assertEquals(help, current.nextReturn());     
    }

    /**
     * Test of nextReturn method, of class StackElement.
     */
    @Test
    public void testNextReturn() {
        StackElement current = new StackElement(test1);
        assertEquals(null, current.nextReturn());
        StackElement help = new StackElement(test2);
        current.setNewNext(help);
        assertEquals(help, current.nextReturn()); 
    }
    
    private final int test1 = 3;
    
    private final int test2 = 5;
}
