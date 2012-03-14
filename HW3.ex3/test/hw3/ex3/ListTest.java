/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3.ex3;

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
    public void testAddToEnd() {
        int first = 1;
        int second = 2;
        List list = new List();
        list.addToEnd(valueOne);
        assertEquals(list.getValue(first), valueOne);
        list.addToEnd(valueTwo);
        assertEquals(list.getValue(second), valueTwo);
    }

    /**
     * Test of addToStart method, of class List.
     */
    @Test
    public void testAddToStart() {
        int first = 1;
        int second = 2;
        List list = new List();
        list.addToStart(valueOne);
        list.addToStart(valueTwo);
        assertEquals(list.getValue(first), valueTwo);
        assertEquals(list.getValue(second), valueOne);
    }

    /**
     * Test of getValue method, of class List.
     */
    @Test
    public void testGetValue() {
        int place = 1;
        List list = new List();
        list.addToEnd(valueOne);
        String result = list.getValue(place);
        assertEquals(valueOne, result);
    }

    /**
     * Test of deleteElement method, of class List.
     */
    @Test
    public void testDeleteElement() {
        List list = new List();
        Boolean answer = true;
        list.addToEnd(valueOne);
        list.addToEnd(valueTwo);
        assertEquals(list.exists(valueOne), answer);
        list.deleteElement(valueOne);
        assertEquals(list.exists(valueOne), !answer);
    }

    /**
     * Test of deleteList method, of class List.
     */
    @Test
    public void testDeleteList() {
        List list = new List();
        boolean answer = false;
        list.addToEnd(valueOne);
        assertEquals(list.isEmpty(), answer);
        list.deleteList();
        assertEquals(list.isEmpty(), !answer);
    }

    /**
     * Test of output method, of class List.
     */
    @Test
    public void testOutput() {
        List list = new List();
        list.addToEnd(valueOne);
        list.addToEnd(valueTwo);
        list.output();
    }

    /**
     * Test of listAmount method, of class List.
     */
    @Test
    public void testListAmount() {
        List list = new List();
        int amount = 2;
        list.addToEnd(valueOne);
        list.addToEnd(valueTwo);
        assertEquals(list.listAmount(), amount);
    }

    /**
     * Test of isEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() {
        List list = new List();
        boolean answer = false;
        list.addToEnd(valueOne);
        assertEquals(list.isEmpty(), answer);
        list.deleteElement(valueOne);
        assertEquals(list.isEmpty(), !answer);
  
    }

    /**
     * Test of exists method, of class List.
     */
    @Test
    public void testExists() {
        List list = new List();
        boolean answer = true;
        assertEquals(list.isEmpty(), answer);
        list.addToEnd(valueOne);
        assertEquals(list.isEmpty(), !answer);
    }
    
    private final String valueOne = "test";
    private final String valueTwo = "problem";
}
