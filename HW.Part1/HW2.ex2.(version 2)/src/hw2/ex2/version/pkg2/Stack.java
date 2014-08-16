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
        lastAdded.setNewValue(value);
        lastAdded.setNewNext(head);
        head = lastAdded;
    }

    /**
     * Change head elemnt
     */
    public void pop() {
        StackElement help = head.nextReturn();
        head = help;
    }

    /**
     * Get top element value
     * @return int top element value
     */
    public int top() {
        return head.getValue();

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
    
    private StackElement head;
}