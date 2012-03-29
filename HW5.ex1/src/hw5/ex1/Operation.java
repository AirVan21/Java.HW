package hw5.ex1;

public class Operation implements TreeElement{
    
    public Operation(char value) {
        operationValue = value;
        rightSon = null;
        leftSon = null;
    }

    @Override
    public boolean isDigit() {
        return false;
    }

    @Override
    public boolean isOperation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public char getOperation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public TreeElement getLeftSon() {
        return this;
    }
    
    @Override
    public TreeElement getRightSon() {
        return this;
    }
     
    public void setRightSon(TreeElement current) {
        this.rightSon = current;
    }

    public void setLeftSon(TreeElement current) {
        this.leftSon = current;
    }
    
    private char operationValue;
    
    private TreeElement leftSon;
    
    private TreeElement rightSon;
    
}
