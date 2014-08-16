package hw4.ex2;

public class StackList implements Stack{
    
    /**
     * Constructor
     */
    public StackList() {
        head = null;
        amount = 0;
    }
    
    @Override
    public int top() {
        if (amount > 0) {
            return head.getValue();
        } else {
            return error;
        }
    }
    
    @Override 
    public void push(int value) {
        StackElement help = new StackElement(value);
        help.setNewNext(head);
        head = help;
        amount++;
    }
    
    @Override
    public void pop() {
        if (amount > 0) {
            head = head.nextReturn();
            amount--;
        }
    }
    
    @Override
    public void deleteStack() {
        head = null;
        amount = 0;
    }
    
    @Override
    public int stackLength() {
        return amount;
    }
    
    private StackElement head;
    
    private int amount;
    
    private final int error = - 100500;
    
}
