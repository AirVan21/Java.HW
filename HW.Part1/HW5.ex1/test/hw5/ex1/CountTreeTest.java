package hw5.ex1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class CountTreeTest {

    public CountTreeTest() {
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
     * Test of getSolution method, of class CountTree.
     */
    @Test
    public void testGetSolution() throws Exception {
        ArithmeticTree tree1 = new ArithmeticTree("(*(+12)3)");
        CountTree answerTree1 = new CountTree(tree1);
        int answer = 9;
        assertEquals(answer, answerTree1.getSolution(tree1.returnHead()));
        ArithmeticTree tree2 = new ArithmeticTree("(+(*23)(-(+89)3))");
        CountTree answerTree2 = new CountTree(tree2);
        answer = 20;
        assertEquals(answer, answerTree2.getSolution(tree2.returnHead()));
    }

    /**
     * Test of computation method, of class CountTree.
     */
    @Test
    public void testComputation() throws Exception {
        ArithmeticTree tree = new ArithmeticTree("(*(+12)3)");
        CountTree answerTree = new CountTree(tree);
        char operation = '+';
        int value1 = 9;
        int value2 = 4;
        assertEquals(13, answerTree.computation(operation, value1, value2));
        operation = '-';
        assertEquals(5, answerTree.computation(operation, value1, value2));
        operation = '*';
        assertEquals(36, answerTree.computation(operation, value1, value2));
        operation = '/';
        assertEquals(2, answerTree.computation(operation, value1, value2));
    }
}
