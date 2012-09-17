package hw10.ex1;

public class StackElement<TreeValue> {
    
    /**
     * Constructor
     * @param value
     * @param id 
     */
    public StackElement(TreeValue value, int id) {
        this.id = id;
        this.value = value;
        this.next = null;
    }
    
    /**
     * Gets next element
     * @return 
     */
    public StackElement<TreeValue> getNext() {
        return this.next;
    }
    
    /**
     * Gets elements value
     * @return 
     */
    public TreeValue getValue() {
        return this.value;
    }
    
    /**
     * Gets id
     * @return 
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Sets next element
     * @param next 
     */
    public void setNext(StackElement<TreeValue> next) {
        this.next = next;
    }
    
    /**
     * Elements value
     */
    private TreeValue value;
    
    /**
     * Unique number
     */
    private int id;
    
    /**
     * Next element
     */
    private StackElement<TreeValue> next;
}
