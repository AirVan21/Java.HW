package hw10.ex1;

import java.util.Iterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class TreeIteratorTest {
    
    public TreeIteratorTest() {
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
     * Test of hasNext method, of class TreeIterator.
     */
    @Test
    public void testForEach() throws AlreadyExistException {
        Tree<String> tree1 = new Tree<>();
        tree1.addElement("a", 2);
        tree1.addElement("b", 1);
        tree1.addElement("c", 4);
        Iterator<String> treeIterator = new TreeIterator<>(tree1.getRoot());
        for (String current : tree1) {
            assertTrue(tree1.elementExist(current));
            System.out.println(current);
        }
    }
    
    /**
     * Test of hasNext method, of class TreeIterator.
     */
    @Test
    public void testHasNext() throws AlreadyExistException {
        Tree<String> tree1 = new Tree<>();
        tree1.addElement("a", 1);
        Iterator<String> treeIterator = new TreeIterator<>(tree1.getRoot());
        assertTrue(treeIterator.hasNext());
        treeIterator.remove();
        assertFalse(treeIterator.hasNext());
    }

    /**
     * Test of next method, of class TreeIterator.
     */
    @Test
    public void testNext() throws AlreadyExistException {
        Tree<String> tree1 = new Tree<>();
        tree1.addElement("a", 1);
        tree1.addElement("b", 2);
        Iterator<String> treeIterator = new TreeIterator<>(tree1.getRoot());
        assertEquals("b", treeIterator.next());
        assertEquals("a", treeIterator.next());
    }

    /**
     * Test of remove method, of class TreeIterator.
     */
    @Test
    public void testRemove() throws AlreadyExistException {
        Tree<String> tree1 = new Tree<>();
        tree1.addElement("a", 1);
        Iterator<String> treeIterator = new TreeIterator<>(tree1.getRoot());
        assertTrue(treeIterator.hasNext());
        treeIterator.remove();
        assertFalse(treeIterator.hasNext());
    }
}
