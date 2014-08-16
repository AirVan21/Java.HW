package hw4.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class StackArrayTest {
    
    public StackArrayTest() {
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
     * Test of top method, of class StackArray.
     */
    @Test
    public void testTop() {
        StackArray stack = new StackArray();
        assertEquals(error, stack.top());
        stack.push(test);
        assertEquals(test, stack.top());
    }

    /**
     * Test of pop method, of class StackArray.
     */
    @Test
    public void testPop() {
        StackArray stack = new StackArray();
        stack.push(test);
        assertEquals(test, stack.top());
        stack.pop();
        assertEquals(error, stack.top());    
    }

    /**
     * Test of push method, of class StackArray.
     */
    @Test
    public void testPush() {
        StackArray stack = new StackArray();
        stack.push(test);
        assertEquals(test, stack.top());
        stack.push(stack.stackLength());
        assertEquals(stack.stackLength() - 1, stack.top());
    }

    /**
     * Test of deleteStack method, of class StackArray.
     */
    @Test
    public void testDeleteStack() {
        StackArray stack = new StackArray();
        stack.push(test);
        stack.deleteStack();
        assertEquals(error, stack.top());
    }

    /**
     * Test of stackLength method, of class StackArray.
     */
    @Test
    public void testStackLength() {
        StackArray stack = new StackArray();
        assertEquals(0, stack.stackLength());
        stack.push(test);
        stack.push(error);
        assertEquals(2, stack.stackLength());
        stack.deleteStack();
        assertEquals(0, stack.stackLength());
    }
    
    private final int error = - 100500;
    
    private final int test = 21;
}
