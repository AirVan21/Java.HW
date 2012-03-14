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
        System.out.println("getValue");
        ListElement instance = null;
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class ListElement.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ListElement instance = null;
        ListElement expResult = null;
        ListElement result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectNext method, of class ListElement.
     */
    @Test
    public void testConnectNext() {
        System.out.println("connectNext");
        ListElement value = null;
        ListElement instance = null;
        instance.connectNext(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
