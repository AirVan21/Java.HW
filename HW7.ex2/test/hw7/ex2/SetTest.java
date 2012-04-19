package hw7.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class SetTest<ValueType> {

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
        Set<Character> testSet = new Set<>();
        assertTrue(testSet.isEmpty());
        testSet.addElement('t');
        testSet.addElement('a');
        assertFalse(testSet.isEmpty());
        assertTrue(testSet.exist('t'));
        assertTrue(testSet.exist('a'));
    }

    /**
     * Test of isEmpty method, of class Set.
     */
    @Test
    public void testIsEmpty() {
        Set<Character> testSet = new Set<>();
        assertTrue(testSet.isEmpty());
        testSet.addElement('a');
        assertFalse(testSet.isEmpty());
    }

    /**
     * Test of exist method, of class Set.
     */
    @Test
    public void testExist() throws Exception {
        Set<Character> testSet = new Set<>();
        assertFalse(testSet.exist('a'));
        testSet.addElement('a');
        assertTrue(testSet.exist('a'));
        testSet.deleteElement('a');
        assertFalse(testSet.exist('a'));
    }

    /**
     * Test of deleteElement method, of class Set.
     */
    @Test
    public void testDeleteElement() throws Exception {
        Set<Character> testSet = new Set<>();
        testSet.addElement('a');
        testSet.addElement('t');
        assertTrue(testSet.exist('a'));
        testSet.deleteElement('a');
        assertFalse(testSet.exist('a'));
        testSet.deleteElement('t');
        assertFalse(testSet.exist('t'));
    }

    /**
     * Test of deleteElement method for Exception, of class Set.
     */
    @Test(expected = WrongActionException.class)
    public void testDeleteElementException() throws Exception {
        Set<Character> testSet = new Set<>();
        testSet.addElement('t');
        testSet.deleteElement('t');
        testSet.deleteElement('t');
    }

    /**
     * Test of union method, of class Set.
     */
    @Test
    public void testUnion() throws Exception {
        Set<Character> testSet1 = new Set<>();
        Set<Character> testSet2 = new Set<>();
        testSet1.addElement('t');
        testSet1.addElement('a');
        testSet2.addElement('y');
        testSet2.addElement('a');
        Set<Character> testUnion = testSet1.union(testSet1, testSet2);
        assertFalse(testUnion.isEmpty());
        assertTrue(testUnion.exist('a'));
        assertTrue(testUnion.exist('t'));
        assertTrue(testUnion.exist('y'));
        testUnion.deleteElement('a');
        assertFalse(testUnion.exist('a'));
    }

    /**
     * Test of intersection method, of class Set.
     */
    @Test
    public void testIntersection() throws Exception {
        Set<Character> testSet1 = new Set<>();
        Set<Character> testSet2 = new Set<>();
        testSet1.addElement('t');
        testSet1.addElement('a');
        testSet2.addElement('u');
        Set<Character> testCross = testSet1.intersection(testSet1, testSet2);
        assertTrue(testCross.isEmpty());
        testSet1.addElement('u');
        testCross = testSet1.intersection(testSet1, testSet2);
        assertTrue(testCross.exist('u'));
        testCross.deleteElement('u');
        assertFalse(testCross.exist('u'));
        assertTrue(testCross.isEmpty());
    }
}
