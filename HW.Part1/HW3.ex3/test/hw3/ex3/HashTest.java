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
        Hash hash = new Hash();
        boolean answer = false;
        assertEquals(answer, hash.exists(valueOne));
        hash.addElement(valueOne);
        hash.addElement(valueTwo);
        assertEquals(!answer, hash.exists(valueOne));
        assertEquals(!answer, hash.exists(valueTwo));
    }

    /**
     * Test of deleteElement method, of class Hash.
     */
    @Test
    public void testDeleteElement() {
        Hash hash = new Hash();
        boolean answer = true;
        hash.addElement(valueOne);
        hash.addElement(valueTwo);
        assertEquals(answer, hash.exists(valueOne));
        hash.deleteElement(valueOne);
        assertEquals(!answer, hash.exists(valueOne));
    }

    /**
     * Test of exists method, of class Hash.
     */
    @Test
    public void testExists() {
       Hash hash = new Hash();
        boolean answer = false;
        assertEquals(answer, hash.exists(valueOne));
        hash.addElement(valueOne);
        assertEquals(!answer, hash.exists(valueOne));
    }
    
    private final String valueOne = "test";
    
    private final String valueTwo = "problem";
}