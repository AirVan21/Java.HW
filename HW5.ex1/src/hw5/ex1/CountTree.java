package hw5.ex1;

public class CountTree {
    
    /**
     * Constructor
     * @param tree Tree, that will be counted 
     */
    public CountTree(ArithmeticTree tree) {
        root = tree.returnHead();
    }
    
    /**
     * Count tree value
     *
     * @param node current Tree Element
     * @return solution
     */
    public int getSolution(TreeElement node) throws IncorrectSymbol, WrongStructure, ImpossibleAction {
        TreeElement left = node.getLeftSon();
        TreeElement right = node.getRightSon();

        if (right.isDigit() && left.isDigit()) {
            return computation(node.getOperation(), left.getValue(), right.getValue());
        }

        if (right.isDigit() && left.isOperation()) {
            int leftValue = getSolution(left);
            return computation(node.getOperation(), leftValue, right.getValue());
        }

        if (right.isOperation() && left.isDigit()) {
            int rightValue = getSolution(right);
            return computation(node.getOperation(), left.getValue(), rightValue);
        }

        if (right.isOperation() && left.isOperation()) {
            int leftValue = getSolution(left);
            int rightValue = getSolution(right);
            return computation(node.getOperation(), leftValue, rightValue);
        }
        throw new WrongStructure("Wrong input structure!");
    }

    /**
     * Count an operation
     * @param operation operation
     * @param value1 operand
     * @param value2 operand
     * @return solution
     */
    private int computation(char operation, int value1, int value2) throws IncorrectSymbol {
        switch (operation) {
            case '+' : return value1 + value2;
            case '-' : return value1 - value2;
            case '*' : return value1 * value2;
            case '/' : return value1 / value2;
            default : throw new IncorrectSymbol("Wrong operation symbol!");
        } 
    }
    
    private TreeElement root;
}
