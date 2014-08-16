package hw7.ex1;

public class Stack<ValueType> {
    
    /**
     * Constructor
     */
    public Stack() {
        head = null;
        amount = 0;
    }
    
    /**
     * Add new element to Stack's head
     * @param value 
     */
    public void push(ValueType value) {
        StackElement<ValueType> lastAdded = new StackElement<>(value);
        lastAdded.next = head;
        head = lastAdded;
        amount++;
    }

    /**
     * Reset head on the next StackElement
     */
    public void pop() throws NotExistException {
        if (amount != 0) {
            head = head.next;
        } else {
            throw new NotExistException("Stack is empty!");
        }
    }

    /**
     * Get head StackElement value
     */
    public ValueType top() throws NotExistException {
        if (amount != 0) {
            return head.value;
        } else {
            throw new NotExistException("Stack is empty!");
        }
    }

    private StackElement<ValueType> head;
    
    private int amount;
    
    /**
     * Class for element of Stack
     * @param <ValueType> 
     */
    private class StackElement<ValueType> {
        
        /**
         * Constructor
         * @param value of StackElement 
         */
        public StackElement(ValueType value) {
            this.value = value;
            this.next = null;
        }
        
        /**
         * Keep StackElement's value
         */
        private ValueType value;
        
        /**
         * Keep connection to the next StackElement
         */
        private StackElement<ValueType> next;
    }
}
