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
        tail.next = current;
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
    public boolean exist(int id) {
        ListElement current = head;
        while (current.next != null) {
            if (current.id == id) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
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
         * Save information about sitting robot 
         */
        protected boolean place;
        
        /**
         * Node id
         */
        protected int id;
        
        protected ListElement next;
    }
    
    private ListElement head;
    
    private ListElement tail;
    
    private int count;
}
