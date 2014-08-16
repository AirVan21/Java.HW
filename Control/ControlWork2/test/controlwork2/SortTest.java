package controlwork2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class SortTest {
    
    public SortTest() {
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
     * Test of getSortedList method, of class Sort.
     */
    @Test
    public void testGetSortedList() throws Exception{
        // есть в мээйне проверка , я не успел
        List<String> list = new List<>();
        Comparator<String> compare = new Comparator<>();
        list.addToEnd("9", 9);
        list.addToEnd("5", 5);
        list.addToEnd("3", 3);
        list.addToEnd("7", 7);
        list.addToEnd("1", 1);
        Sort<String> bubble = new Sort<>(list, compare);
        list = bubble.getSortedList();
        assertFalse(list.isEmpty());
        assertEquals(5, list.listAmount());
        assertEquals("1", list.getValue(1));
        assertEquals("5", list.getValue(3));    
    }
}
