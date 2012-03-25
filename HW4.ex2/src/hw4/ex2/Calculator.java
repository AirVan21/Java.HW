package hw4.ex2;

public class Calculator {
    
    /**
     * Constructor
     * @param stackType type of realisation (StackArray | StackList)
     */
    public Calculator(Stack stackType) {
        stack = stackType;
    }
    
    /**
     * Get sum from first stack elements
     * @return sum
     */
    public int addition() {
        if (stack.stackLength() > 1) {
            int firstNum = stack.top();
            stack.pop();
            int secondNum = stack.top();
            stack.pop();
            return firstNum + secondNum;
        } else {
            return error;
        }
    }
    
    /**
     * Get subtraction from first stack elements (first minus second)
     * @return subtraction
     */
    public int subtraction() {
        if (stack.stackLength() > 1) {
            int firstNum = stack.top();
            stack.pop();
            int secondNum = stack.top();
            stack.pop();
            return firstNum - secondNum;
        } else {
            return error;
        }
    }
    
    /**
     * Get the multiplication from first stack elements 
     * @return multiplication 
     */
    public int multiplication() {
        if (stack.stackLength() > 1) {
            int firstNum = stack.top();
            stack.pop();
            int secondNum = stack.top();
            stack.pop();
            return firstNum * secondNum;
        } else {
            return error;
        }
    }
    
    /**
     * Get the division from first stack elements 
     * @return division
     */
    public double division() {
        if (stack.stackLength() > 1) {
            int firstNum = stack.top();
            stack.pop();
            int secondNum = stack.top();
            stack.pop();
            return firstNum / secondNum;
        } else {
            return error;
        }
    }
    
    /**
     * Delete top element from stack
     */
    public void pop() {
        stack.pop();
    }
    
    /**
     * Add new element to the stack top
     * @param value element value
     */
    public void push(int value) {
        stack.push(value);
    }
    
    /**
     * Amount of elements in calculator's memory
     * @return int amount
     */
    public int memoryAmount() {
        return stack.stackLength();
    }
    
    private Stack stack;
    
    private final int error = - 100500;
}
