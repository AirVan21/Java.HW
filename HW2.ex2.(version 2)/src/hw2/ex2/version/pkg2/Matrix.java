
package hw2.ex2.version.pkg2;

import java.util.Random;

/**
 *
 * @author AirVan
 */
public class Matrix {
    
    /**
     * 
     * Constructor
     * @param length Table width 
     */
    public Matrix(int length) {
        column = new Stack[length];
        for (int i = 0; i < length; i++) {
            column[i] = new Stack();
        } 
    }
    
    /**
     * Filling Table's columns
     */
    public void fillMatrix() {
        Random generator = new Random();
        for (int i = 0; i < column.length; i++) {
            for (int j = 0; j <column.length; i++) {
                 column[i].push(generator.nextInt(9) + 1);
            }    
        }
    }
    
    /**
     * Sorting columns with a help of first elemnts
     */
    public void sortMatrixOnFirst() {
        for (int i = 0; i < column.length; i++) {
            for (int j = 1; j < column.length; j++) {
                if (column[j].top() < column[j - 1].top()) {
                    StackElement help = column[j].getHead();
                    column[j].setNewHead(column[j - 1].getHead());
                    column[j - 1].setNewHead(help);
                }
            }
        }
    }
    
    /**
     * Just output
     */
    public void output() {
        for (int i = 0; i < column.length; i++) {
            for (int j = 1; j < column.length; j++) {
                System.out.print(Integer.toString(column[j].top()));
                column[j].pop();
            }
            System.out.println();
        }
    }
    
    private Stack column[];
}
