/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.ex1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class StackTest {
    
    public StackTest() {
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
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        Stack<String> stack = new Stack<>();
        stack.push("a", 1, null, null);
        assertEquals("a", stack.top().getValue());
        stack.push("b", 2, null, null);
        assertEquals("b", stack.top().getValue());
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        stack.push("a", 1, null, null);
        assertEquals("a", stack.top().getValue());
        stack.push("b", 2, null, null);
        stack.pop();
        assertEquals("a", stack.top().getValue());
    }
    
    /**
     * Test of top method, of class Stack.
     */
    @Test
    public void testTop() {
        Stack<String> stack = new Stack<>();
        stack.push("a", 1, null, null);
        assertEquals("a", stack.top().getValue());
    } 
}
