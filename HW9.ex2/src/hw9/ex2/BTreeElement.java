package hw9.ex2;

/**
 * Class for a B - Tree Elements
 *
 * @param <ValueType> elements's value type
 */
public class BTreeElement<ValueType> {

    /**
     * Constructir for a B - Tree Element
     *
     * @param key - for a search
     * @param value - current value
     */
    public BTreeElement(int key, ValueType value) {
        this.key = key;
        this.value = value;
    }
    
    /**
     * Check for empty
     */
    public boolean isEmpty() {
        return this.key == 0;
    }
    
    /**
     * Set value
     */
    public void setValue(ValueType value) {
        this.value = value;
    }
    
    /**
     * Set key
     */
    public void setKey(int key) {
        this.key = key;
    }
    
    /*
     * Valuable information
     */
    private ValueType value;
    
    /**
     * Node id
     */
    private int key;
}
