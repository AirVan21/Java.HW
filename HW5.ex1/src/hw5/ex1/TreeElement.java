package hw5.ex1;

public interface TreeElement {
    
    
    /**
     * Check the nature
     * @return (true | false)
     */
    public boolean isDigit();
    
    /**
     * Check the nature
     * @return (true | false)
     */
    public boolean isOperation();
    
    /**
     * Get digit value
     * @return digit's value
     */
    public int getValue();
    
    /**
     * Get operation essense
     * @return (+ | - | * | / |)
     */
    public char getOperation();
    
    /**
     * Get right TreeElement
     * @return right TreeElement, which below
     */
    public TreeElement getRightSon();
    
    /**
     * Get right TreeElement
     * @return right TreeElement, which below
     */
    public TreeElement getLeftSon();
    
    
    /**
     * Set new right son for Treeelement
     * @param current value
     */
    public void setRightSon(TreeElement current);
    
    /**
     * Set new left son for Treeelement
     * @param current value
     */
    public void setLeftSon(TreeElement current);
    
}
