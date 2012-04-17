package hw7.ex2;

/**
 * Set class declaration
 */
public class Set<ValueType> {
    
    /**
     * Constructor
     */
    public Set() {
        head = null;
        tail = null;
        amount = 0;
    }
    
    /**
     * Add new element in a Set
     * @param value 
     */
    public void addElement(ValueType value) {
        if (!exist(value)) {
            SetElement current = new SetElement(value);
            if (amount == 0) {
                head = current;
                tail = current;
            } else {
                tail.connectNext(current);
                tail = current;
            }
            amount++;
        }
    }
    
    /**
     * Empty | Not Empty
     */
    public boolean isEmpty() {
        return amount == 0;
    }
    
    /**
     * Check existence of element
     * @param value 
     * @return 
     */
    public boolean exist(ValueType value) {
        SetElement help = head;
        while (help != tail.getNext()) {
            if (help.getValue() == value) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Delete elements from set
     * @param value
     * @throws WrongActionException 
     */
    public void deleteElement(ValueType value) throws WrongActionException {
        if (exist(value)) {
            SetElement previous = head;
            SetElement current = head.getNext();
            if (previous.getValue() == value) {
                head = current;
            } else {
                while (current.getValue() != value) {
                    previous = current;
                    current = current.getNext();
                }
                previous.connectNext(current.getNext());
            }
        } else {
            throw new WrongActionException("U wanna delete an element which doesn't exist");
        }
    }
   
    private SetElement head;
    
    private SetElement tail;
    
    private int amount;
}
