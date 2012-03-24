package hw4.ex2;

public class StackElement {

    /**
     * Get value
     * 
     * @return element value
     */
    public int getValue() {
        return value;
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
    public void setNewNext(StackElement newNext) {
        this.next = newNext;
    }
    
    /**
     * Return next stack element
     */
    public StackElement nextReturn() {
        return this.next;
    }
  
    private int value;
    
    private StackElement next;
}
