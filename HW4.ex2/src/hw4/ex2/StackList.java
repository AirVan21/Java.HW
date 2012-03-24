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
        return head.getValue();
        
    }
    
    @Override 
    public void push(int value) {
        StackElement help = new StackElement();
        help.setNewValue(value);
        help.setNewNext(head);
        head = help;
        amount++;
    }
    
    @Override 
    public void pop() {
        head = head.nextReturn();
        amount--;
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
    
}
