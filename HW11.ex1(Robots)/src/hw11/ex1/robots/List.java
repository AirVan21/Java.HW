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
     * Deleting ListElement with this id
     * @param id id of node, which should be deleted
     */
    public void delete(int id) {
        ListElement current = this.getHead();
        ListElement previous = this.head;
        while (current != null) {
            if (current.getId() == id) {
                previous.setNext(current.getNext());
            }
            previous = current;
            current = current.getNext();
        }
    }
    
    /**
     * Checks exist element with this id ot not
     * @param searchId searchin id
     */
    public boolean exist(int searchId) {
        ListElement current = this.getHead();
        while (current != null) {
            if (current.getId() == searchId) {
                return true;
            }
        }
        return false;
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
        while (current != null) {
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
