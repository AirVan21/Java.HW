package hw1.ex1;

import javax.swing.JOptionPane;

public class HW1Ex1 {

    private static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        int myNum = Integer.parseInt(JOptionPane.showInputDialog("Please, input the number"));
        JOptionPane.showMessageDialog(null, "Factorial(" + Integer.toString(myNum) + ") = " + Integer.toString(factorial(myNum)));
    }
}

