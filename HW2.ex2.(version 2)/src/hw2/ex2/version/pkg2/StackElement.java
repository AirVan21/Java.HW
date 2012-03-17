package hw2.ex2.version.pkg2;

public class StackElement {

    /**
     * Get value
     * @return element value
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Return next stack element
     */
    public StackElement nextReturn() {
        return next;
    }
    
    /**
     * Set new value for the element
     * @param value element's new value
     */
    public void setNewValue(int value) {
        this.value = value;
    }
    
    /**
     * Set new next value
     * @param newNext  element's new next value
     */
    public void SetNewNext(StackElement newNext) {
        next = newNext;
    }
    
    private int value;
    
    private StackElement next;
}
