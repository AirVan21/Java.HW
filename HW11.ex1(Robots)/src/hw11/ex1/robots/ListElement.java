package hw11.ex1.robots;

/**
 * Class for a element of List
 */
public class ListElement {

    public ListElement(boolean information, int num) {
        this.next = null;
        this.place = information;
        this.id = num;
    }
    
    /**
     * Get's next element
     * @return 
     */
    public ListElement getNext() {
        return this.next;
    }
    
    /**
     * Get's next element
     * @return 
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Set's next element
     * @return 
     */
    public void setNext(ListElement current) {
        this.next = current;
    }
    
    /**
     * Check robot
     *
     * @return
     */
    public boolean robotHere() {
        return this.place;
    }
    /**
     * Save information about sitting robot
     */
    private boolean place;
    /**
     * Node id
     */
    private int id;
    /**
     * Element, which is standing after current
     */
    private ListElement next;
}
