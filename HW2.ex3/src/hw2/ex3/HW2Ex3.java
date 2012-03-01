package hw2.ex3;

public class HW2Ex3 {

    public static void main(String[] args) {
        List list = new List();
        list.addToEnd(5); // 5
        list.addToStart(2);// 2 5
        list.addToEnd(7);// 2 5 7
        list.addToPosition(2, 66);// 2 66 5 7
        list.output();
        list.deleteElement(66);// 2 5 7
        list.output();
        System.out.println("Amount of elements = " + Integer.toString(list.listAmount())); 
        System.out.println("Second Number = " + Integer.toString(list.getValue(2)));
        list.deleteList();
    }
}
