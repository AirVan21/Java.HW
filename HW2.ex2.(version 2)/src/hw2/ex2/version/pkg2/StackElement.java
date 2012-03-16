package hw2.ex2.version.pkg2;

public class StackElement {

    /**
     * Get value
     * @return element value
     */
    public int getValue() {
        return value;
    }
    
    public StackElement nextReturn() {
        return next;
    }
    
    public void setNewValue(int value) {
        this.value = value;
    }
    
    public void SetNewNext(StackElement newNext) {
        next = newNext;
    }
    
    private int value;
    
    private StackElement next;
}
