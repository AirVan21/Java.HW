package hw2.ex2.version.pkg2;


public class HW2Ex2Version2 {
    
    
    public static void main(String[] args) {
        int length = 5;
        Matrix matrix = new Matrix(length);
        matrix.fillMatrix();
        matrix.output();
        System.out.println();
        matrix.sortMatrixOnFirst();
        matrix.output();
    }
}
