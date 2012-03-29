package hw5.ex1;

public class HW5Ex1 {

    public static void main(String[] args) {
        ArithmeticTree tree = new ArithmeticTree("(+(*23)(-(+89)3))");
        CountTree answer = new CountTree(tree);
    }
}
