package hw2.ex4;

public class HW2Ex4 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(Integer.toString(stack.top()));
        stack.pop();
        stack.pop();
        System.out.println(Integer.toString(stack.top()));

    }
}
