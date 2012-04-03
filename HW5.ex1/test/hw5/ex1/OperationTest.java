package hw5.ex1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class OperationTest {

    public OperationTest() {
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
     * Test of isDigit method, of class Operation.
     */
    @Test
    public void testIsDigit() {
        TreeElement operation = new Operation(valueChar);
        assertFalse(operation.isDigit());
    }

    /**
     * Test of isOperation method, of class Operation.
     */
    @Test
    public void testIsOperation() {
        TreeElement operation = new Operation(valueChar);
        assertTrue(operation.isOperation());
    }

    /**
     * Test of getValue method, of class Operation.
     */
    @Test(expected = ImpossibleAction.class)
    public void testGetValue() throws Exception {
        TreeElement operation = new Operation(valueChar);
        operation.getValue();
    }

    /**
     * Test of getOperation method, of class Operation.
     */
    @Test
    public void testGetOperation() throws Exception {
        TreeElement operation = new Operation(valueChar);
        assertEquals(valueChar, operation.getOperation());
    }

    /**
     * Test of getLeftSon method, of class Operation.
     */
    @Test
    public void testGetLeftSon() throws Exception {
        TreeElement operation = new Operation(valueChar);
        TreeElement digit = new Digit(valueInt);
        operation.setLeftSon(digit);
        assertEquals(digit, operation.getLeftSon());
    }

    /**
     * Test of getRightSon method, of class Operation.
     */
    @Test
    public void testGetRightSon() throws Exception {
        TreeElement operation = new Operation(valueChar);
        TreeElement digit = new Digit(valueInt);
        operation.setRightSon(digit);
        assertEquals(digit, operation.getRightSon());
    }

    /**
     * Test of setRightSon method, of class Operation.
     */
    @Test
    public void testSetRightSon() throws Exception {
        TreeElement operation = new Operation(valueChar);
        TreeElement digit = new Digit(valueInt);
        operation.setRightSon(digit);
        assertEquals(digit, operation.getRightSon());
    }

    /**
     * Test of setLeftSon method, of class Operation.
     */
    @Test
    public void testSetLeftSon() throws Exception {
        TreeElement operation = new Operation(valueChar);
        TreeElement digit = new Digit(valueInt);
        operation.setLeftSon(digit);
        assertEquals(digit, operation.getLeftSon());
    }

    private final char valueChar = '*';
    
    private final int valueInt = 7;
}
