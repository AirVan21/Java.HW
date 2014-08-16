package hw5.ex1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class DigitTest {

    public DigitTest() {
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
     * Test of isDigit method, of class Digit.
     */
    @Test
    public void testIsDigit() {
        TreeElement digit = new Digit(valueInt);
        assertTrue(digit.isDigit());
    }

    /**
     * Test of isOperation method, of class Digit.
     */
    @Test
    public void testIsOperation() {
        TreeElement digit = new Digit(valueInt);
        assertFalse(digit.isOperation());
    }

    /**
     * Test of getValue method, of class Digit.
     */
    @Test
    public void testGetValue() throws Exception {
        TreeElement digit = new Digit(valueInt);
        assertEquals(valueInt, digit.getValue());
    }

    /**
     * Test of getOperation method, of class Digit.
     */
    @Test(expected = ImpossibleAction.class)
    public void testGetOperation() throws Exception {
        TreeElement digit = new Digit(valueInt);
        digit.getOperation();
    }

    /**
     * Test of getRightSon method, of class Digit.
     */
    @Test(expected = ImpossibleAction.class)
    public void testGetRightSon() throws Exception {
        TreeElement digit = new Digit(valueInt);
        digit.getRightSon();
    }

    /**
     * Test of getLeftSon method, of class Digit.
     */
    @Test(expected = ImpossibleAction.class)
    public void testGetLeftSon() throws Exception {
        TreeElement digit = new Digit(valueInt);
        digit.getLeftSon();
    }

    /**
     * Test of setRightSon method, of class Digit.
     */
    @Test(expected = ImpossibleAction.class)
    public void testSetRightSon() throws Exception {
        TreeElement digit = new Digit(valueInt);
        digit.setRightSon(digit);
    }

    /**
     * Test of setLeftSon method, of class Digit.
     */
    @Test(expected = ImpossibleAction.class)
    public void testSetLeftSon() throws Exception {
        TreeElement digit = new Digit(valueInt);
        digit.setLeftSon(digit);
    }

    private final int valueInt = 7;
    
}
