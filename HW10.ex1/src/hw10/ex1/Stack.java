package hw10.ex1;

public class Stack<TreeValue> {
    
    /**
     * Constructor
     */
    public Stack() {
        head = null;
        count = 0;
    }

    public void push(TreeValue value, int id) {
        StackElement<TreeValue> lastAdded = new StackElement<>(value, id);
        lastAdded.setNext(head);
        head = lastAdded;
        count++;
    }
    
    /**
     * Pop head element
     */
    public void pop() {
        if (this.count != 0) {
            head = head.getNext();
            count--;
        } else {
            // throw exception;
        }
    }
    
    /**
     * Gets value
     * @return 
     */
    public TreeValue top() {
        if (head != null) {
            return head.getValue();
        } 
        return null;
    }
    
    private StackElement<TreeValue> head;
    
    /**
     * Amount of stack elements
     */
    private int count;
}