package hw5.ex1;

public class ArithmeticTree {
    
    /**
     * Constructor
     * @param expression - current formula 
     */
    public ArithmeticTree(String expression) {
        head = fillTree(expression);
        counter = 0;    
    }
    
    public TreeElement returnHead() {
        return head;
    }
    
    /**
     * Tree creation (add TreeElement in 2 steps)
     * a) If block starts with '(' then make Operation with "sons"
     * b) If number was found , we would make Digit without "sons"
     * 
     * (first code set - for First son)
     * (second code set - for Secod son)
     * 
     * 2 types of mistakes could be found.
     * 
     * @param expression - current formula
     * @return  - link on head TreeElement
     */
    private TreeElement fillTree(String expression) {
        if (isComponent(expression.charAt(counter))) {
            counterUp();
            TreeElement currentOperation = new Operation(expression.charAt(counter));
            counterUp();
            if (isComponent(expression.charAt(counter))) {
                currentOperation.setLeftSon(fillTree(expression));
                counterUp();
            } else {
                if (isNumber(expression.charAt(counter))) {
                    int number = Integer.parseInt(String.valueOf(expression.charAt(counter)));
                    TreeElement currentNum = new Digit(number);
                    currentOperation.setLeftSon(currentNum);
                    counterUp();
                } else {
                    if (expression.charAt(counter) == ')') {
                        counterUp();
                    } else {
                      // impossible symbol   
                    }                  
                }
            }

            if (isComponent(expression.charAt(counter))) {
                currentOperation.setRightSon(fillTree(expression));
                counterUp();
            } else {
                if (isNumber(expression.charAt(counter))) {
                    int number = Integer.parseInt(String.valueOf(expression.charAt(counter)));
                    TreeElement currentNum = new Digit(number);
                    currentOperation.setRightSon(currentNum);
                    counterUp();
                } else {
                    if (expression.charAt(counter) == ')') {
                        counterUp();
                    } else {
                      // impossible symbol   
                    }                  
                }
            }        
            return currentOperation;
        }
        throw new NullPointerException("Wrong input structure!");
    }
    
    /**
     * Check, is it a number 
     * @param symbol experimental
     * @return True story or not
     */
    private boolean isNumber(char symbol) {
        return (('0' <= symbol) && (symbol <= '9'));
    }
    
    /**
     * Check, is it a '('
     * @param symbol experimental
     * @return True | False
     */
    private boolean isComponent(char symbol) {
        return symbol == '(';
    }
    
    /**
     * Made for expression walk
     * It eats symbols, which are unnecessary in our Tree
     */
    private void counterUp() {
        counter++;
    }
    
    
    private static int counter;
    
    private TreeElement head;
}