package hw7.ex1;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Tests
 */
public class ListTest {
    
    public ListTest() {
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
        List<String> list = new List<>();
        assertTrue(list.isEmpty());
        list.addToEnd("test1");
        assertTrue(list.exist("test1"));
        list.addToEnd("test2");
        assertEquals("test1", list.getValue(1));
    }

    /**
     * Test of addToStart method, of class List.
     */
    @Test
    public void testAddToStart() throws Exception{
        List<String> list = new List<>();
        assertTrue(list.isEmpty());
        list.addToStart("test1");
        assertTrue(list.exist("test1"));
        list.addToStart("test2");
        assertEquals("test2", list.getValue(1));
    }

    /**
     * Test of exist method, of class List.
     */
    @Test
    public void testExist() {
        List<String> list = new List<>();
        assertFalse(list.exist("test1"));
        list.addToEnd("test1");
        assertTrue(list.exist("test1"));
    }

    /**
     * Test of getValue method, of class List.
     */
    @Test
    public void testGetValue() throws Exception {
        List<String> list = new List<>();
        list.addToEnd("test2");
        list.addToStart("test1");
        assertEquals("test1", list.getValue(1));
        assertEquals("test2", list.getValue(2));
    }

        /**
     * Test of getValue method for Exception, of class List.
     */
    @Test(expected = NotExistException.class)
    public void testGetValueException() throws Exception {
        List<String> list = new List<>();
        list.getValue(2);
    }
    
    /**
     * Test of deleteElement method, of class List.
     */
    @Test
    public void testDeleteElement() throws Exception {
        List<String> list = new List<>();
        list.addToEnd("test1");
        list.addToEnd("test2");
        list.deleteElement("test2");
        assertFalse(list.exist("test2"));
        assertTrue(list.exist("test1"));
        list.deleteElement("test1");
        assertTrue(list.isEmpty());
    }
    
    /**
     * Test of deleteElement method, of class List.
     */
    @Test(expected = NotExistException.class)
    public void testDeleteElementException() throws Exception {
        List<String> list = new List<>();
        list.addToEnd("test1");
        list.deleteElement("test2");
    }

    /**
     * Test of listAmount method, of class List.
     */
    @Test
    public void testListAmount() {
        List<String> list = new List<>();
        list.addToEnd("test1");
        assertEquals(1, list.listAmount());
        list.addToStart("test2");
        assertEquals(2, list.listAmount());
    }

    /**
     * Test of isEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() {
        List<String> list = new List<>();
        assertTrue(list.isEmpty());
        list.addToEnd("test1");
        assertFalse(list.isEmpty());
    }
}
