package hw11.ex1.robots;

public class List {

    /**
     * Constructor
     */
    public List() {
        ListElement guard = new ListElement(false, 0);
        head = guard;
        tail = guard;
        count = 0;
    }
    

    /**
     * Addition in the end
     *
     * @param value element value
     */
    public void add(boolean value, int id) {
        ListElement current = new ListElement(value, id);
        tail.setNext(current);
        tail = current;
        count++;
    }

    /**
     * Get the List length
     */
    public int listAmount() {
        return count;
    }
    
    /**
     * Test inclusion
     * @return 
     */
    public boolean existConnection(int id) {
        ListElement current = head;
        while (current.getNext() != null) {
            if (current.getId() == id) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    
    /**
     * Takes List's head
     * @return 
     */
    public ListElement getHead() {
        return this.head.getNext();
    }
    
    /**
     * Head of List
     */
    private ListElement head;
    
    /**
     * Tail of List
     */
    private ListElement tail;
    
    /**
     * Amount of elements
     */
    private int count;
}
