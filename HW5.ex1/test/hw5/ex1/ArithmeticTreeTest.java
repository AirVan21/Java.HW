package hw5.ex1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class ArithmeticTreeTest {

    public ArithmeticTreeTest() {
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
     * Test of fillTree method, of class ArithmeticTree.
     */
    @Test(expected = WrongStructure.class)
    public void testFillTreeStructure() throws Exception {
        ArithmeticTree tree = new ArithmeticTree("+()");
    }

    @Test(expected = IncorrectSymbol.class)
    public void testFillTreeSymbol() throws Exception {
        ArithmeticTree tree = new ArithmeticTree("(+р5)");
    }
}
