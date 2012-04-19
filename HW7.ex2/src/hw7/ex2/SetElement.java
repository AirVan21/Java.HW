package hw7.ex2;

/**
 * SetElement calss declaration
 */
public class SetElement<ValueType> {
    
    /**
     * Constructor
     * @param value of SetElement 
     */
    public SetElement (ValueType value) {
        this.value = value;
        this.next = null;
    }
    
    /**
     * Get SetElement value
     * @return 
     */
    public ValueType getValue() {
        return this.value;
    }
    
    /**
     * Get SetElement which connected with this one
     */
    public SetElement<ValueType> getNext() {
        return this.next;
    }
    
    /**
     * Connect current element with other one
     * @param connected 
     */
    public void connectNext(SetElement<ValueType> connected) {
        this.next = connected;
    }
    
    private ValueType value;
    
    private SetElement<ValueType> next;
    
}
