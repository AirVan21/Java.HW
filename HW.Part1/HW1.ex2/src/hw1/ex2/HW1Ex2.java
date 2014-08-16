package hw1.ex2;

import javax.swing.JOptionPane;


public class HW1Ex2 {
    
    private static int fibNum(int position){
        if (position == 1 || position == 2)
            return 1;
        return fibNum(position - 1) + fibNum(position - 2);
    }

    public static void main(String[] args) {
        int myNum = Integer.parseInt(JOptionPane.showInputDialog("Please, input the number"));
        JOptionPane.showMessageDialog(null,Integer.toString(myNum)+ " Fibon Number = " + Integer.toString(fibNum(myNum)));
    }
}
