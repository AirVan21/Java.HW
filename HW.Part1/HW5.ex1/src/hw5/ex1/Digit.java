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
    public char getOperation() throws ImpossibleAction {
        throw new ImpossibleAction("Digit couldn't have operation");
    }

    @Override
    public TreeElement getRightSon() throws ImpossibleAction {
        throw new ImpossibleAction("Digit couldn't have son");
    }

    @Override
    public TreeElement getLeftSon() throws ImpossibleAction {
        throw new ImpossibleAction("Digit couldn't have son");
    }

    @Override
    public void setRightSon(TreeElement current) throws ImpossibleAction {
        throw new ImpossibleAction("Digit couldn't have son");
    }

    @Override
    public void setLeftSon(TreeElement current) throws ImpossibleAction {
        throw new ImpossibleAction("Digit couldn't have son");
    }
    
    private int value;
    
}
