package hw2.ex4;

public class Stack {

    private StackElement head;
 

    public Stack() {
        head = null;
    }

    public void push(int value) {
        StackElement lastAdded = new StackElement();
        lastAdded.value = value;
        lastAdded.next = head;
        head = lastAdded;

    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;

    }
}