package hw3.ex4;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class originalHashFunctionTest {
    
    public originalHashFunctionTest() {
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
     * Test of hashCounter method, of class originalHashFunction.
     */
    @Test
    public void testHashCounter() {
        String line = "sun";
        int hashLength = 31;
        originalHashFunction instance = new originalHashFunction();
        int expResult = Math.abs(line.hashCode() % hashLength); 
        int result = instance.hashCounter(line, hashLength);
        assertEquals(expResult, result);
    }
}
