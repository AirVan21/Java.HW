package hw1.ex3;

import java.util.Random;
        
public class HW1Ex3 {
    
    private static void ShowArray(int []array){
        for (int i = 0; i < array.length; i++){
            System.out.print(Integer.toString(array[i]));
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        final int length = 10;
        int intArray[] = new int [length];
        Random generator;
        generator = new Random();
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = generator.nextInt(9) + 1;
        }
        System.out.print("Original array : ");
        ShowArray(intArray);
        
        for (int i = 0; i < intArray.length; i++){        //BubbleSort
            for (int j = 1; j < intArray.length - i; j++)
            {
                if (intArray[j - 1] > intArray[j]){
                    int help = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = help;
                }
            }
        }
        System.out.print("Sorted array : ");
        ShowArray(intArray);
    }
}
