package hw3.ex3;

public class ListElement {
    
    public ListElement(String value) {
        this.next = null;
        this.value = value;
    }
    
    /**
     * get element value 
     */
    public String getValue() {
        return this.value;
    }
    
    /**
     * get element link
     * @param current selected element
     * @return 
     */
    public ListElement next(ListElement current) {
        return current.next;
    }
    
    /**
     * connect two elements
     * @param connect element which shoul be connected
     * @param value  connection place
     */
    public void connectNext(ListElement connect, ListElement value) {
        connect.next = value;
    }
            
    private String value;
    
    private ListElement next;
}
