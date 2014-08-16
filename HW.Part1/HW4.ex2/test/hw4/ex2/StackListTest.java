package hw4.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class StackListTest {
    
    public StackListTest() {
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
     * Test of top method, of class StackList.
     */
    @Test
    public void testTop() {
        StackList stack = new StackList();
        stack.push(test1);
        assertEquals(test1, stack.top());
        stack.push(test2);
        assertEquals(test2, stack.top());
        stack.pop();
        assertEquals(test1, stack.top());
    }

    /**
     * Test of push method, of class StackList.
     */
    @Test
    public void testPush() {
        StackList stack = new StackList();
        stack.push(test1);
        stack.push(test2);
        assertEquals(test2, stack.top());
        assertEquals(2, stack.stackLength());
        stack.pop();
        assertEquals(test1, stack.top());
    }

    /**
     * Test of pop method, of class StackList.
     */
    @Test
    public void testPop() {
        StackList stack = new StackList();
        stack.push(test1);
        stack.push(test2);
        stack.pop();
        assertEquals(test1, stack.top());
        assertEquals(1, stack.stackLength());
        stack.pop();
        assertEquals(error, stack.top());
    }

    /**
     * Test of deleteStack method, of class StackList.
     */
    @Test
    public void testDeleteStack() {
        StackList stack = new StackList();
        stack.push(test1);
        stack.deleteStack();
        assertEquals(0, stack.stackLength());
    }

    /**
     * Test of stackLength method, of class StackList.
     */
    @Test
    public void testStackLength() {
        StackList stack = new StackList();
        assertEquals(0, stack.stackLength());
        stack.push(test1);
        stack.push(test2);
        assertEquals(2, stack.stackLength());
        stack.pop();
        assertEquals(1, stack.stackLength());
    }
    
    private final int test1 = 3;
    
    private final int test2 = 5;
    
    private final int error = - 100500;
}
