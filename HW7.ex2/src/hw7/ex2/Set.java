package hw7.ex2;

/**
 * Set class declaration
 */
public class Set {
    
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
    public void addElement(Object value) {
        if (amount == 0) {
            SetElement current = new SetElement(value);
            head = current;
            tail = current;
            amount++;
        } else {
            if (!exist(value)) {
                SetElement current = new SetElement(value);
                tail.connectNext(current);
                tail = current;
                amount++;
            }
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
    public boolean exist(Object value) {
        if (!this.isEmpty()) {
            SetElement help = head;
            while (help != tail.getNext()) {
                if (help.getValue() == value) {
                    return true;
                }
                help = help.getNext();
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * Delete elements from set
     * @param value
     * @throws WrongActionException 
     */
    public void deleteElement(Object value) throws WrongActionException {
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
            amount--;
        } else {
            throw new WrongActionException("U wanna delete an element which doesn't exist");
        }
    }
   
    /**
     * Union two sets
     * @param set1 first set
     * @param set2 second set
     * @return 
     */
    public Set union(Set set1, Set set2) {
        Set unionSet = new Set();       
        SetElement current = set1.head;
        if (!set1.isEmpty()) {
            while (current != set1.tail.getNext()) {
                unionSet.addElement(current.getValue());
                current = current.getNext();
            }       
        }

        current = set2.head;
        
        if (!set2.isEmpty()) {
            while (current != set2.tail.getNext()) {
                if (!unionSet.exist(current.getValue())) {
                    unionSet.addElement(current.getValue());
                }
                current = current.getNext();
            }
        }
        return unionSet;
    }
    
    /**
     * Intersecti two sets
     * @param set1 first set
     * @param set2 second set
     * @return 
     */
    public Set intersection(Set set1, Set set2) {
        Set crossSet = new Set();
        SetElement current = set1.head;
        if (!set1.isEmpty()) {
            while (current != set1.tail.getNext()) {
                if (set2.exist(current.getValue())) {
                    crossSet.addElement(current.getValue());
                }
                current = current.getNext();
            }
        }
        return crossSet;
    }
    
    private SetElement head;
    
    private SetElement tail;
    
    private int amount;
}
