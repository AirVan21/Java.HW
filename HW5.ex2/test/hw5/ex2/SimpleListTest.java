package hw5.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class SimpleListTest {
    
    public SimpleListTest() {
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
     * Test of addToEnd method, of class List.
     */
    @Test
    public void testAddToEnd() throws Exception {
        SimpleList list = new SimpleList();
        list.addToEnd(valueOne);
        assertEquals(valueOne, list.getValue(1));
        list.addToEnd(valueTwo);
        assertEquals(valueTwo, list.getValue(2));
    }
    
    /**
     * Test of addToStart method, of class List.
     */
    @Test
    public void testAddToStart() throws Exception {
        SimpleList list = new SimpleList();
        list.addToStart(valueOne);
        list.addToStart(valueTwo);
        assertEquals(valueTwo, list.getValue(1));
        assertEquals(valueOne, list.getValue(2));
    }

    /**
     * Test of getValue method, of class List.
     */
    @Test
    public void testGetValue() throws Exception {
        SimpleList list = new SimpleList();
        list.addToEnd(valueOne);
        list.addToEnd(valueTwo);
        assertEquals(valueOne, list.getValue(1));
        assertEquals(valueTwo, list.getValue(2));
    }
   
    /**
     * Test of deleteElement method, of class List.
     */
    @Test
    public void testDeleteElement() throws Exception {
        SimpleList list = new SimpleList();
        list.addToEnd(valueOne);
        assertTrue(list.exists(valueOne));
        list.deleteElement(valueOne);
        assertFalse(list.exists(valueOne));
    }

    /**
     * Test of deleteList method, of class List.
     */
    @Test
    public void testDeleteList() throws Exception {
        SimpleList list = new SimpleList();   
        list.addToEnd(valueOne);
        list.deleteList();
        assertTrue(list.isEmpty());
        assertEquals(0, list.listAmount());
    }

    /**
     * Test of listAmount method, of class List.
     */
    @Test
    public void testListAmount() throws Exception {
        SimpleList list = new SimpleList();
        assertEquals(0, list.listAmount());       
        list.addToEnd(valueOne);
        assertEquals(1, list.listAmount());
        list.addToStart(valueTwo);
        assertEquals(2, list.listAmount());
        list.deleteList();
        assertEquals(0, list.listAmount());
    }

    /**
     * Test of isEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() throws Exception {
        SimpleList list = new SimpleList();
        assertTrue(list.isEmpty());
        list.addToStart(valueOne);
        assertFalse(list.isEmpty());
        list.deleteList();
        assertTrue(list.isEmpty());
    }

    /**
     * Test of exists method, of class List.
     */
    @Test
    public void testExists() throws Exception{
        SimpleList list = new SimpleList();
        list.addToStart(valueOne);
        assertTrue(list.exists(valueOne));
        list.deleteElement(valueOne);
        assertFalse(list.exists(valueOne));
    }
    
    private final String valueOne = "test";
    
    private final String valueTwo = "problems";
}
