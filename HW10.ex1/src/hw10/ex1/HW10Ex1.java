package hw10.ex1;

public class HW10Ex1 {

    public static void main(String[] args) {
        Tree<String> tree1 = new Tree<>();
        tree1.addElement("a", 10);
        tree1.addElement("b", 8);
        tree1.addElement("c", 11);
        tree1.addElement("d", 7);
        tree1.addElement("e", 9);
        tree1.output();
    }
}