package hw5.ex1;

public class Digit implements TreeElement{
    
    public Digit(int value) {
        this.value = value;
    }

    @Override
    public boolean isDigit() {
        return true;
    }

    @Override
    public boolean isOperation() {
        return false;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public char getOperation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TreeElement getRightSon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TreeElement getLeftSon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRightSon(TreeElement current) {
    }

    @Override
    public void setLeftSon(TreeElement current) {
    }
    
    private int value;
    
}
