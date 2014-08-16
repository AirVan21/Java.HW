package hw7.ex1;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Tests
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
    public void testPush() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push((Integer) 1);
        stack.push((Integer) 2);
        assertEquals((Integer) 2, stack.top());
        stack.pop();
        assertEquals((Integer) 1, stack.top());
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push((Integer) 1);
        stack.push((Integer) 2);
        stack.pop();
        assertEquals((Integer) 1, stack.top());
    }

    /**
     * Test of pop method for Exception, of class Stack.
     */
    @Test(expected = NotExistException.class)
    public void testPopException() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.pop();
    }

    /**
     * Test of top method, of class Stack.
     */
    @Test
    public void testTop() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push((Integer) 1);
        stack.push((Integer) 2);
        assertEquals((Integer) 2, stack.top());
        stack.pop();
        assertEquals((Integer) 1, stack.top());
    }

    /**
     * Test of top method for Exception, of class Stack.
     */
    @Test(expected = NotExistException.class)
    public void testTopException() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.top();
    }
}
