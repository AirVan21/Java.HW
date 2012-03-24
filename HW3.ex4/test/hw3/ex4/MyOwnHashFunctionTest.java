package hw3.ex4;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class MyOwnHashFunctionTest {
    
    public MyOwnHashFunctionTest() {
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
     * Test of hashCounter method, of class MyOwnHashFunction.
     */
    @Test
    public void testHashCounter() {
        String line = "sun";
        int hashLength = 31;
        MyOwnHashFunction instance = new MyOwnHashFunction();
        int expResult = (('s' * simpleNum + 'u') * simpleNum + 'n') % hashLength;
        int result = instance.hashCounter(line, hashLength);
        assertEquals(expResult, result);
    }
    
    private final int simpleNum = 7;
}
