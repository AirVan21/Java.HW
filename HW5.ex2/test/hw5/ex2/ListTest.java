package hw5.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
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
    
    /**
     * Test of addToEnd method for Exception, of class List.
     */
    @Test (expected = AlreadyExist.class)
    public void testAddToEndForException() throws Exception {
        SimpleList list = new List();
        list.addToEnd(valueOne);
        list.addToEnd(valueOne);
    }

    /**
     * Test of addToStart method for Exception, of class List.
     */
    @Test(expected = AlreadyExist.class)
    public void testAddToStartForException() throws Exception {
        SimpleList list = new List();
        list.addToStart(valueOne);
        list.addToStart(valueOne);
    }
    
    /**
     * Test of getValue method forExceptin, of class List.
     */
    @Test (expected = NotExist.class)
    public void testGetValueForExceptin() throws Exception {
        SimpleList list = new List();
        assertEquals(valueOne, list.getValue(2));
    }
    
    /**
     * Test of deleteElement method for Exception, of class List.
     */
    @Test (expected = NotExist.class)
    public void testDeleteElementForException() throws Exception {
        SimpleList list = new List();
        list.addToEnd(valueOne);
        list.deleteElement(valueOne);
        list.deleteElement(valueOne);
    }
    
    private final String valueOne = "test";
    
}