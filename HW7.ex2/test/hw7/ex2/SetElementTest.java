package hw7.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class SetElementTest {
    
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
        SetElement test1 = new SetElement('a');
        SetElement test2 = new SetElement(22.44);
        assertEquals('a', test1.getValue());
        assertEquals(22.44, test2.getValue());

    }

    /**
     * Test of getNext method, of class SetElement.
     */
    @Test
    public void testGetNext() {
        SetElement test1 = new SetElement('a');
        SetElement test2 = new SetElement(22.44);
        test1.connectNext(test2);
        assertEquals(test2, test1.getNext());
    }

    /**
     * Test of connectNext method, of class SetElement.
     */
    @Test
    public void testConnectNext() {
        SetElement test1 = new SetElement('a');
        SetElement test2 = new SetElement(22.44);
        test2.connectNext(test1);
        test1.connectNext(test2);
        assertEquals(test1, test2.getNext());
        assertEquals(test2, test1.getNext());
    }
}
