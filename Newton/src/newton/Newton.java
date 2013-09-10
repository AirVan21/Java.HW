/*
 * Finding equation's roots, using Newton's method
 */
package newton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author AirVan
 */
public class Newton {

    public static void main(String[] args) throws IOException {
        // Text file, where
        // First line contains int dimension value
        // Second line contains monoms' power values
        // Third line contains coefficients, startin' with major monom coefficient 
        String filePath = "c:\\NumMath\\EQ1.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            String[] lineOne = line.split(" ");
            int dimension = lineOne.length;
            
            double[] coefArray = new double[dimension];
            int[] powArray = new int[dimension];
            line = reader.readLine();
            String[] lineTwo = line.split(" ");
            // Splitting coefficient string, using " " as a selector
            for (int j = 0; j < dimension; j++) {
                int  power = Integer.parseInt(lineOne[j]);
                double value = Double.parseDouble(lineTwo[j]);
                powArray[j] = power;
                coefArray[j] = value;
                System.out.print(coefArray[j]);
                System.out.print("x^(" + (powArray[j]) + ") ");
            } 
            System.out.println("= 0");
            
            NewtonCalc mainObj = new NewtonCalc(coefArray, powArray);
            System.out.println("Up = " + mainObj.upLimPlus());
            System.out.println("Low = " + mainObj.lowLimNeg());
            mainObj.findSignChange();
        } catch (FileNotFoundException ex) {
             System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
    }
}
