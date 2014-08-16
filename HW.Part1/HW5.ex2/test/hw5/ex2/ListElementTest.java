package hw5.ex2;

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
        ListElement test = new ListElement(valueOne);
        assertEquals(valueOne, test.getValue());
    }

    /**
     * Test of next method, of class ListElement.
     */
    @Test
    public void testNext() {
        ListElement test = new ListElement(valueOne);
        ListElement connected = new ListElement(valueTwo);
        test.connectNext(connected);
        assertEquals(connected, test.next());
    }

    /**
     * Test of connectNext method, of class ListElement.
     */
    @Test
    public void testConnectNext() {
        ListElement test = new ListElement(valueOne);
        ListElement connected = new ListElement(valueTwo);
        test.connectNext(connected);
        assertEquals(connected, test.next());
    }

    private final String valueOne = "test";
    
    private final String valueTwo = "problem";
    
}
