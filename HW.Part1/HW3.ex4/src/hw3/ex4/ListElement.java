package hw3.ex4;

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
    public ListElement next() {
        return next;
    }
    
    /**
     * connect two elements
     * @param connect element which shoul be connected
     * @param value  connection place
     */
    public void connectNext(ListElement value) {
        next = value;
    }
            
    private String value;
    
    private ListElement next;
}
