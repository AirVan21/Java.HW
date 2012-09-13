package hw10.ex1;

/**
 * TreeElement and help-methods
 */
public class TreeElement<TreeValue> {
    
    /**
     * Constructor
     */
    public TreeElement(TreeValue value, int id){
        this.value = value;
        this.id = id;
        this.leftSon = null;
        this.rightSon = null;
    }
    
    /**
     * get TreeElement value
     * @return value
     */
    public TreeValue getValue() {
        return this.value;
    }
    
    /**
     * get TreeElement id 
     * @return id
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * set Left son for a current 
     * @param connected 
     */
    public void setLeftSon(TreeElement<TreeValue> connected) {
        this.leftSon = connected;
    }
    
    /**
     * set Right son for a current 
     * @param connected 
     */
    public void seRightSon(TreeElement<TreeValue> connected) {
        this.rightSon = connected;
    }
    
    /**
     * get Left son 
     * @return 
     */
    public TreeElement<TreeValue> getLeftSon() {
        return this.leftSon;
    }
    
    /**
     * get Right son 
     * @return 
     */
    public TreeElement<TreeValue> getRightSon() {
        return this.rightSon;
    }
    
    
    /**
     * main information
     */
    private TreeValue value;
    
    /**
     * unique id
     */
    private int id;
    
    /**
     * left son
     */
    private TreeElement<TreeValue> leftSon;
    
    /**
     * right son
     */
    private TreeElement<TreeValue> rightSon;
       
}
