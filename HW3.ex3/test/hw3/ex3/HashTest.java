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
public class HashTest {
    
    public HashTest() {
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
     * Test of addElement method, of class Hash.
     */
    @Test
    public void testAddElement() {
        System.out.println("addElement");
        String value = "";
        Hash instance = new Hash();
        instance.addElement(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteElement method, of class Hash.
     */
    @Test
    public void testDeleteElement() {
        System.out.println("deleteElement");
        String value = "";
        Hash instance = new Hash();
        instance.deleteElement(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exists method, of class Hash.
     */
    @Test
    public void testExists() {
        System.out.println("exists");
        String value = "";
        Hash instance = new Hash();
        boolean expResult = false;
        boolean result = instance.exists(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashOutput method, of class Hash.
     */
    @Test
    public void testHashOutput() {
        System.out.println("hashOutput");
        Hash instance = new Hash();
        instance.hashOutput();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
