package controlwork1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class QueueTest {

    public QueueTest() {
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
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() throws Exception {
        Queue queue = new Queue();
        queue.enqueue(7, 10);
        queue.enqueue('t', 15);
        assertEquals('t', queue.dequeue());
        assertEquals(7, queue.dequeue());
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() throws Exception {
        Queue queue = new Queue();
        queue.enqueue(7, 10);
        queue.enqueue('t', 5);
        assertEquals(7, queue.dequeue());
        queue.enqueue('y', 6);
        assertEquals('y', queue.dequeue());
    }

    /**
     * Test of dequeue method for Exception, of class Queue.
     */
    @Test(expected = AskFromEmpty.class)
    public void testDequeueForException() throws Exception {
        Queue queue = new Queue();
        queue.enqueue(7, 10);
        queue.dequeue();
        queue.dequeue();
    }
}
