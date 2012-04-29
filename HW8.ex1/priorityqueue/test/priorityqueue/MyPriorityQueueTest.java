/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqueue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lich
 */
public class MyPriorityQueueTest {

    public MyPriorityQueueTest() {
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
     * Test of enqueue method, of class MyPriorityQueue.
     */
    @Test
    public void testEnqueueDequeueInteger() throws Exception {
        MyPriorityQueue<Integer> instance = new MyPriorityQueue<Integer>();
        instance.enqueue(150, 1);
        instance.enqueue(100, 0);       
        assertEquals((Integer)100, instance.dequeue());
        assertEquals((Integer)150, instance.dequeue());
    }

    @Test
    public void testEnqueueDequeueString() throws Exception {
        MyPriorityQueue<String> instance = new MyPriorityQueue<String>();
        instance.enqueue("str1", 1);
        instance.enqueue("str2", 1);
        instance.enqueue("str3", 3);
        assertEquals("str2", instance.dequeue());
        assertEquals("str1", instance.dequeue());
        assertEquals("str3", instance.dequeue());
    }

    @Test (expected = EmptyQueueException.class)
    public void testQueueException() throws Exception {
        MyPriorityQueue<String> instance = new MyPriorityQueue<String>();
        instance.dequeue();
    }
}
