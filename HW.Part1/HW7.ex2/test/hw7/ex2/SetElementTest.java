package hw7.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class SetElementTest<ValueType> {
    
    public SetElementTest() {
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
     * Test of getValue method, of class SetElement.
     */
    @Test
    public void testGetValue() {
        SetElement<Character> test1 = new SetElement<>('a');
        SetElement<Character> test2 = new SetElement<>('b');
        assertEquals((Character)'a', test1.getValue());
        assertEquals((Character)'b', test2.getValue());
    }

    /**
     * Test of getNext method, of class SetElement.
     */
    @Test
    public void testGetNext() {
        SetElement<Character> test1 = new SetElement<>('a');
        SetElement<Character> test2 = new SetElement<>('b');
        test1.connectNext(test2);
        assertEquals(test2, test1.getNext());
    }

    /**
     * Test of connectNext method, of class SetElement.
     */
    @Test
    public void testConnectNext() {
        SetElement<Character> test1 = new SetElement<>('a');
        SetElement<Character> test2 = new SetElement<>('b');
        test2.connectNext(test1);
        test1.connectNext(test2);
        assertEquals(test1, test2.getNext());
        assertEquals(test2, test1.getNext());
    }
}
