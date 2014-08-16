package hw5.ex1;

public class HW5Ex1 {

    public static void main(String[] args) {
        try {
            ArithmeticTree tree = new ArithmeticTree("(+(*23)(-(+89)3))");
             CountTree answer = new CountTree(tree);
        } catch (WrongStructure exception1) {
            System.out.println(exception1.getMessage());
        } catch (IncorrectSymbol exception2) {
            System.out.println(exception2.getMessage());
        } catch (ImpossibleAction exception3) {
            System.out.println(exception3.getMessage());
        }
    }
}
