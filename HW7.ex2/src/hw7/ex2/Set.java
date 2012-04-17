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
        amount = 0;
    }
    
    public void addElement(ValueType value) {
        SetElement current = new SetElement(value);
        
    }
    
    
    private SetElement head;
    
    private int amount;
}
