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
        return true;
    }

    @Override
    public int getValue() throws ImpossibleAction {
        throw new ImpossibleAction("Operation couldn't have value");
    }

    @Override
    public char getOperation() {
        return operationValue;
    }
    
    @Override
    public TreeElement getLeftSon() {
        return this.leftSon;
    }
    
    @Override
    public TreeElement getRightSon() {
        return this.rightSon;
    }
    
    @Override
    public void setRightSon(TreeElement current) {
        this.rightSon = current;
    }
    
    @Override
    public void setLeftSon(TreeElement current) {
        this.leftSon = current;
    }
    
    private char operationValue;
    
    private TreeElement leftSon;
    
    private TreeElement rightSon;
    
}
