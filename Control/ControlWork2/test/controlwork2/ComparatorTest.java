package controlwork2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class ComparatorTest {
    
    public ComparatorTest() {
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
     * Test of firstBigger method, of class Comparator.
     */
    @Test
    public void testFirstBigger() {
        Comparator<String> compare = new Comparator<>();
        ListElement<String> value1 = new ListElement<>("a", 10);
        ListElement<String> value2 = new ListElement<>("b", 5);
        assertFalse(compare.firstBigger(value2, value1));
        assertTrue(compare.firstBigger(value1, value2));
    }
}
