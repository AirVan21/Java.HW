/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void testGetSortedList() {
        System.out.println("getSortedList");
        Sort instance = null;
        List expResult = null;
        List result = instance.getSortedList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
