/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.ex2.network;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class RandomizerTest {
    
    public RandomizerTest() {
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
     * Test of getResult method, of class Randomizer.
     */
    @Test
    public void testGetResult() {
        Randomizer rand1 = new Randomizer(100);
        assertTrue(rand1.getResult());
        Randomizer rand2 = new Randomizer(0);
        assertFalse(rand2.getResult());
    }
}
