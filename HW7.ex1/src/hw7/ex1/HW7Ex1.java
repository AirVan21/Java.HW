package hw7.ex1;

public class HW7Ex1 {

    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.addToEnd((Integer)5);
        list.addToEnd((Integer)10);
        list.addToEnd((Integer)15);
        try {System.out.println(list.getValue(4));}
        catch (NotExistException exception) {
            System.out.println(exception.toString());
        } 
        list.output();
    }
}
