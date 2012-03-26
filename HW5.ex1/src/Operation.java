public class Operation implements TreeElement{

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
    
    @Override TreeElement() {
        
    }
    
    private char operationValue;
    
    private TreeElement leftSon;
    
    private TreeElement rightSon;
    
}
