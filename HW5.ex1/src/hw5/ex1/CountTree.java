package hw5.ex1;

public class CountTree {

    public CountTree(ArithmeticTree tree) {
        root = tree.returnHead();
        int answer = getSolution(root);
    }

    public int getSolution(TreeElement node) {
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
        return 0;
    }
    
    private int computation(char operation, int value1, int value2) {
        switch (operation) {
            case '+' : return value1 + value2;
            case '-' : return value1 - value2;
            case '*' : return value1 * value2;
            case '/' : return value1 / value2;
        }
        return 0;
    }
    private TreeElement root;
}
