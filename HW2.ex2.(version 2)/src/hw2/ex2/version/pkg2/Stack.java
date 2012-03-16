package hw2.ex2.version.pkg2;

public class Stack {
 
    /**
     * Constructor
     */
    public Stack() {
        head = null;
    }

    /**
     * Add new stack element
     * @param value additional element value
     */
    public void push(int value) {
        StackElement lastAdded = new StackElement();
        lastAdded.value = value;
        lastAdded.next = head;
        head = lastAdded;

    }

    /**
     * Change head elemnt
     */
    public void pop() {
        head = head.next;
    }

    /**
     * Get top element value
     * @return int top element value
     */
    public int top() {
        return head.value;

    }
    
    /**
     * Delete stack
     */
    public void deleteStack() {
        head = null;
    }
    
    /**
     * Get stack head
     * @return 
     */
    public StackElement getHead() {
        return head;
    }
    
    /**
     * Set a new head for stack
     * @param newHead 
     */
    public void setNewHead(StackElement newHead) {
        this.head = newHead;
    }
    
    /**
     * Changes stacks' heads
     * @param stack1 first stack
     * @param stack2 second stack
     */
    public void swapStack(Stack stack1, Stack stack2) {
        StackElement help = stack1.getHead();
        stack1.setNewHead(stack2.getHead());
        stack2.setNewHead(help);
    }
    
    private StackElement head;
}