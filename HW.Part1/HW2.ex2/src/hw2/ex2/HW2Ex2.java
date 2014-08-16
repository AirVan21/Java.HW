package hw2.ex2;

import java.util.Random;
import javax.swing.JOptionPane;

public class HW2Ex2 {

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(Integer.toString(array[i]));
            System.out.print(" ");
        }
        System.out.println();
    }
    
    private static void bubbleSort(int[] аrray) {
        for (int i = 0; i < аrray.length; i++) {
            for (int j = 1; j < аrray.length - i; j++) {
                if (аrray[j - 1] > аrray[j]) {
                    int help = аrray[j - 1];
                    аrray[j - 1] = аrray[j];
                    аrray[j] = help;
                }
            }
        }
    }
    
    private static void outputTable(int аrray[][]) {
        for (int i = 0; i < аrray.length; i++) {
            for (int j = 0; j < аrray.length; j++) {
                System.out.print(Integer.toString(аrray[i][j]) + " ");
            }
            System.out.println();
        }
    }
    
    private static void changeCol(int аrray[][], int col1, int col2) { 
        int help;
        for (int i = 0; i < аrray.length; i++) {
            help = аrray[i][col1];
            аrray[i][col1] = аrray[i][col2];
            аrray[i][col2] = help;
        }

    }
    
    private static int lookFor(int аrray[][], int example, int start) { //поиск элемента для замены
        for (int i = start; i < аrray.length; i++) {
            if (аrray[0][i] == example) {
                return i;
            }
        }
        return 0;
    }
    
    private static void tableSort(int array[][]) {
        int helpElementArr[] = new int[array.length];//массив первой строки матрицы
        for (int i = 0; i < array.length; i++) {
            helpElementArr[i] = array[0][i];
        }
        bubbleSort(helpElementArr);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (helpElementArr[i] != array[0][i]) {
                int colNum = lookFor(array, helpElementArr[i], i);
                changeCol(array, colNum, i);
            }
        }
        System.out.println("Sorted Table");
        outputTable(array);
    }

    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Input the table  Dimension"));
        int intArray[][] = new int[length][length];
        Random generator = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                intArray[i][j] = generator.nextInt(8);
            }
        }
        JOptionPane.showMessageDialog(null, "Take a look at the console!");
        outputTable(intArray);
        tableSort(intArray);
    }
}
