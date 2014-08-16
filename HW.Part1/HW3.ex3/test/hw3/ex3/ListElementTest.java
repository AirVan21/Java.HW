package hw3.ex3;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class ListElementTest {
    
    public ListElementTest() {
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
     * Test of getValue method, of class ListElement.
     */
    @Test
    public void testGetValue() {
        ListElement current = new ListElement("a");
        assertEquals("a", current.getValue());
    }

    /**
     * Test of next method, of class ListElement.
     */
    @Test
    public void testNext() {
        ListElement current1 = new ListElement("a");
        ListElement current2 = new ListElement("b");
        current1.connectNext(current2);
        assertEquals(current2, current1.next());
    }

    /**
     * Test of connectNext method, of class ListElement.
     */
    @Test
    public void testConnectNext() {
        ListElement current1 = new ListElement("a");
        ListElement current2 = new ListElement("b");
        current1.connectNext(current2);
        assertEquals(current2, current1.next());
    }
}
