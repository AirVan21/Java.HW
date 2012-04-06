package controlwork1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class QueueElementTest {

    public QueueElementTest() {
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
     * Test of getValue method, of class QueueElement.
     */
    @Test
    public void testGetValue() {
        QueueElement test = new QueueElement('t', 10);
        assertEquals('t', test.getValue());
    }

    /**
     * Test of getPriority method, of class QueueElement.
     */
    @Test
    public void testGetPriority() {
        QueueElement test = new QueueElement('t', 10);
        assertEquals(10, test.getPriority());
    }

    /**
     * Test of next method, of class QueueElement.
     */
    @Test
    public void testNext() {
        QueueElement test1 = new QueueElement('t', 10);
        QueueElement test2 = new QueueElement(5, 10);
        test1.connectNext(test2);
        assertEquals(test2, test1.next());
    }

    /**
     * Test of connectNext method, of class QueueElement.
     */
    @Test
    public void testConnectNext() {
        QueueElement test1 = new QueueElement('t', 10);
        QueueElement test2 = new QueueElement(5, 10);
        test1.connectNext(test2);
        assertEquals(test2, test1.next());
    }
}
