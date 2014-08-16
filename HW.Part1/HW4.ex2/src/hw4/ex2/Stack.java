package hw4.ex2;

public interface Stack {
    

    /**
     * Get top element value
     * @return top elemnet value
     */
    public int top();
    
    /**
     * Throw away top stack elemnt
     */
    public void pop();
    
    /**
     * Add new element to stack
     * @param value  element value
     */
    public void push(int value);
    
    /**
     * Stack deletion
     */
    public void deleteStack();
    
    /**
     * Amount of stack elements 
     */
    public int stackLength();
}
