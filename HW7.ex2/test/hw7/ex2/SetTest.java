package hw7.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class SetTest {

    public SetTest() {
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
     * Test of addElement method, of class Set.
     */
    @Test
    public void testAddElement() {
        Set testSet = new Set();
        assertTrue(testSet.isEmpty());
        testSet.addElement("test");
        testSet.addElement(33);
        assertFalse(testSet.isEmpty());
        assertTrue(testSet.exist(33));
        assertTrue(testSet.exist("test"));
    }

    /**
     * Test of isEmpty method, of class Set.
     */
    @Test
    public void testIsEmpty() {
        Set testSet = new Set();
        assertTrue(testSet.isEmpty());
        testSet.addElement("test");
        assertFalse(testSet.isEmpty());
    }

    /**
     * Test of exist method, of class Set.
     */
    @Test
    public void testExist() throws Exception {
        Set testSet = new Set();
        assertFalse(testSet.exist("test"));
        testSet.addElement("test");
        assertTrue(testSet.exist("test"));
        testSet.deleteElement("test");
        assertFalse(testSet.exist("test"));
    }

    /**
     * Test of deleteElement method, of class Set.
     */
    @Test
    public void testDeleteElement() throws Exception {
        Set testSet = new Set();
        testSet.addElement("test");
        testSet.addElement(23);
        assertTrue(testSet.exist(23));
        testSet.deleteElement(23);
        assertFalse(testSet.exist(23));
        testSet.deleteElement("test");
        assertFalse(testSet.exist("test"));
    }

    /**
     * Test of deleteElement method for Exception, of class Set.
     */
    @Test(expected = WrongActionException.class)
    public void testDeleteElementException() throws Exception {
        Set testSet = new Set();
        testSet.addElement("test");
        testSet.deleteElement("test");
        testSet.deleteElement("test");
    }

    /**
     * Test of union method, of class Set.
     */
    @Test
    public void testUnion() throws Exception {
        Set testSet1 = new Set();
        Set testSet2 = new Set();
        testSet1.addElement("test");
        testSet1.addElement('a');
        testSet2.addElement(44);
        testSet2.addElement('a');
        Set testUnion = testSet1.union(testSet1, testSet2);
        assertFalse(testUnion.isEmpty());
        assertTrue(testUnion.exist('a'));
        assertTrue(testUnion.exist("test"));
        assertTrue(testUnion.exist(44));
        testUnion.deleteElement('a');
        assertFalse(testUnion.exist('a'));
    }

    /**
     * Test of intersection method, of class Set.
     */
    @Test
    public void testIntersection() throws Exception {
        Set testSet1 = new Set();
        Set testSet2 = new Set();
        testSet1.addElement("test");
        testSet1.addElement('a');
        testSet2.addElement(44);
        Set testCross = testSet1.intersection(testSet1, testSet2);
        assertTrue(testCross.isEmpty());
        testSet1.addElement(44);
        testCross = testSet1.intersection(testSet1, testSet2);
        assertTrue(testCross.exist(44));
        testCross.deleteElement(44);
        assertFalse(testCross.exist(44));
        assertTrue(testCross.isEmpty());
    }
}
