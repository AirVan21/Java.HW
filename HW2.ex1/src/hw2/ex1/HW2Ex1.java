package hw2.ex1;

import java.util.Random;
import javax.swing.JOptionPane;

public class HW2Ex1 {

    private static void output(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(Integer.toString(array[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static void makeArray(int array[][]) {
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = generator.nextInt(8);
            }

        }
    }

    private static void snake(int аrray[][]) {
        int step = 1;
        int row = (аrray.length / 2);
        int col = row;
        System.out.println("Обход по с пирали, начиная с центра :");
        while (step < аrray.length) {
            for (int i = col; i > (col - step); i--) {
                System.out.print(Integer.toString(аrray[row][i]) + " ");
            }
            col = col - step;
            for (int i = row; i > (row - step); i--) {
                System.out.print(Integer.toString(аrray[i][col]) + " ");
            }
            row = row - step;
            step++;
            if (step < аrray.length) {
                for (int i = col; i < (col + step); i++) {
                    System.out.print(Integer.toString(аrray[row][i]) + " ");
                }
                col = col + step;
                for (int i = row; i < (row + step); i++) {
                    System.out.print(Integer.toString(аrray[i][col]) + " ");
                }
                row = row + step;
                step++;
            }
        }
        for (int i = col; i > (col - step); i--) {
            System.out.print(Integer.toString(аrray[row][i]) + " ");
        }

    }

    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Input the Number (2k - 1)"));
        int intArray[][] = new int[length][length];
        if (length % 2 != 0) {
            makeArray(intArray);
            JOptionPane.showMessageDialog(null, "Take a look at the console!");
            output(intArray);
            snake(intArray);

        } else {
            JOptionPane.showMessageDialog(null, "Wrong Number");
        }
    }
}
