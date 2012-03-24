package hw4.ex2;

public class StackArray implements Stack{

    public StackArray() {
        stack = new int[elementAmount];
        amount = 0;
    }
    
    @Override
    public int top() {
        if (amount != 0) {
            return stack[0];
        }
        else return error;
        
    }

    @Override
    public void pop() {
        if (amount != 0) {
            for (int i = 0; i < amount - 1; i++) {
                stack[i] = stack[i + 1];
            }
            amount--;
        }
    }

    @Override
    public void push(int value) {
        for (int i = amount - 1; i > 0; i--) {
            stack[i + 1] = stack[i];
        }
        stack[0] = value;
        amount++;
    }

    @Override
    public void deleteStack() {
        for (int i = 0; i < amount; i++) {
            stack[i] = 0;
        }
        amount = 0;
    }

    @Override
    public int stackLength() {
        return amount;
    }
    
    private int[] stack;
    
    private final int elementAmount = 50;
    
    private int amount;
    
    private final int error = - 100500;
}
