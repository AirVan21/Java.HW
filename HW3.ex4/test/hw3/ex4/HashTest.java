package hw3.ex4;

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
        MyOwnHashFunction hashCounter1 = new MyOwnHashFunction();
        Hash hash1 = new Hash(hashCounter1);
        assertEquals(false, hash1.exists(valueOne));
        hash1.addElement(valueOne);
        assertEquals(true, hash1.exists(valueOne));
        
        originalHashFunction hashCounter2 = new originalHashFunction();
        Hash hash2 = new Hash(hashCounter2);
        assertEquals(false, hash2.exists(valueTwo));
        hash2.addElement(valueTwo);
        assertEquals(true, hash2.exists(valueTwo));
    }

    /**
     * Test of deleteElement method, of class Hash.
     */
    @Test
    public void testDeleteElement() {
        MyOwnHashFunction hashCounter1 = new MyOwnHashFunction();
        Hash hash1 = new Hash(hashCounter1);
        hash1.addElement(valueOne);
        assertEquals(true, hash1.exists(valueOne));
        hash1.deleteElement(valueOne);
        assertEquals(!true, hash1.exists(valueOne));
        
        originalHashFunction hashCounter2 = new originalHashFunction();
        Hash hash2 = new Hash(hashCounter2);
        hash2.addElement(valueOne);
        assertEquals(true, hash2.exists(valueOne));
        hash2.deleteElement(valueOne);
        assertEquals(false, hash2.exists(valueOne));
    }

    /**
     * Test of exists method, of class Hash.
     */
    @Test
    public void testExists() {
        MyOwnHashFunction hashCounter1 = new MyOwnHashFunction();
        Hash hash1 = new Hash(hashCounter1);
        assertEquals(false, hash1.exists(valueOne));
        hash1.addElement(valueOne);
        assertEquals(true, hash1.exists(valueOne));
        
        originalHashFunction hashCounter2 = new originalHashFunction();
        Hash hash2 = new Hash(hashCounter2);
        assertEquals(false, hash2.exists(valueOne));
        hash2.addElement(valueOne);
        assertEquals(true, hash2.exists(valueOne));
    }
    
    private final String valueOne = "test";
    
    private final String valueTwo = "problem";
}