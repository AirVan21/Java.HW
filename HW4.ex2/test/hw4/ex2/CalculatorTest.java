/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4.ex2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of addition method, of class Calculator.
     */
    @Test
    public void testAddition() {
        StackList stack1 = new StackList();
        Calculator calc1 = new Calculator(stack1);
        calc1.push(test1);
        calc1.push(test2);
        calc1.push(test1 + test2);
        assertEquals(2 * test2 + test1, calc1.addition());
        
        StackArray stack2 = new StackArray();
        Calculator calc2 = new Calculator(stack2);
        calc2.push(test1);
        calc2.push(test2);
        assertEquals(test2 + test1, calc2.addition());
    }

    /**
     * Test of subtraction method, of class Calculator.
     */
    @Test
    public void testSubtraction() {
        StackList stack1 = new StackList();
        Calculator calc1 = new Calculator(stack1);
        calc1.push(test1);
        calc1.push(test2);
        assertEquals(test2 - test1, calc1.subtraction());
        
        StackArray stack2 = new StackArray();
        Calculator calc2 = new Calculator(stack2);
        calc2.push(test1);
        calc2.push(test2);
        calc2.push(test1 + test2);
        assertEquals(test1, calc2.subtraction());
    }

    /**
     * Test of multiplication method, of class Calculator.
     */
    @Test
    public void testMultiplication() {
        StackList stack1 = new StackList();
        Calculator calc1 = new Calculator(stack1);
        calc1.push(test1);
        calc1.push(test2);
        assertEquals(test1 * test2, calc1.multiplication());
        
        StackArray stack2 = new StackArray();
        Calculator calc2 = new Calculator(stack2);
        calc2.push(test1);
        calc2.push(test2);
        assertEquals(test2 * test1, calc2.multiplication());
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        StackList stack1 = new StackList();
        Calculator calc1 = new Calculator(stack1);
        calc1.push(test1);
        calc1.push(test2);
        calc1.push(test1 + test2);
        double answer = (test1 + test2) / test2;
        assertEquals(answer, calc1.division(), 0.1);
        
        StackArray stack2 = new StackArray();
        Calculator calc2 = new Calculator(stack2);
        calc2.push(test1);
        calc2.push(test2);
        calc2.push(test1 + test2);
        assertEquals(answer, calc2.division(), 0.1);
    }

    /**
     * Test of pop method, of class Calculator.
     */
    @Test
    public void testPop() {
        StackList stack1 = new StackList();
        Calculator calc1 = new Calculator(stack1);
        calc1.push(test1);
        calc1.push(test2);
        assertEquals(2, calc1.memoryAmount());
        calc1.pop();
        assertEquals(1, calc1.memoryAmount());
        calc1.pop();
        assertEquals(0, calc1.memoryAmount());
        
        StackArray stack2 = new StackArray();
        Calculator calc2 = new Calculator(stack2);
        calc2.push(test1);
        calc2.push(test2);
        calc2.pop();
        assertEquals(1, calc2.memoryAmount());
        calc2.pop();
        calc2.pop();
        assertEquals(0, calc2.memoryAmount());
    }

    /**
     * Test of push method, of class Calculator.
     */
    @Test
    public void testPush() {
        StackList stack1 = new StackList();
        Calculator calc1 = new Calculator(stack1);
        calc1.push(test1);
        calc1.push(test2);
        assertEquals(2, calc1.memoryAmount());
        
        StackArray stack2 = new StackArray();
        Calculator calc2 = new Calculator(stack2);
        calc2.push(test1);
        assertEquals(1, calc2.memoryAmount());
    }

    /**
     * Test of memoryAmount method, of class Calculator.
     */
    @Test
    public void testMemoryAmount() {
        StackList stack1 = new StackList();
        Calculator calc1 = new Calculator(stack1);
        calc1.push(test1);
        calc1.push(test2);
        assertEquals(2, calc1.memoryAmount());
        calc1.pop();
        assertEquals(1, calc1.memoryAmount());
        
        StackArray stack2 = new StackArray();
        Calculator calc2 = new Calculator(stack2);
        calc2.push(test1);
        assertEquals(1, calc2.memoryAmount());
        calc2.pop();
        assertEquals(0, calc2.memoryAmount());
        calc2.pop();
        assertEquals(0, calc2.memoryAmount());   
        
    }
    
    private final int test1 = 3;
    
    private final int test2 = 5;
}
