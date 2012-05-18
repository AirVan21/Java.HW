package controlwork2;

/**
 * Class for a element of List
 *
 * @param <ValueType> element's value type
 */
public class ListElement<ValueType> {

    /**
     * Constructor
     * @param value 
     */
    public ListElement(ValueType value, int key) {
        this.key = key;
        this.next = null;
        this.value = value;
    }
    
    /**
     * Get next
     * @return 
     */
    public ListElement<ValueType> getNext() {
        return this.next;
    }
    
    /**
     * Set new next element
     * @param current 
     */
    public void setNext(ListElement<ValueType> current) {
        this.next = current;
    }
    
    /**
     * Set value
     */
    public void setValue(ValueType newValue) {
        this.value = newValue;
    }
    
    /**
     * Set Key
     */
    public void setKey(int newKey) {
        this.key = newKey;
    }
    
    /**
     * Get value
     */
    public ValueType getValue() {
        return this.value;
    }
    
    /**
     * Get key
     */
    public int getKey() {
        return this.key;
    }
    
    /**
     * Should be > 0
     */
    private int key;
    
    /**
     * Main value
     */
    private ValueType value;
    
    private ListElement<ValueType> next;
}
