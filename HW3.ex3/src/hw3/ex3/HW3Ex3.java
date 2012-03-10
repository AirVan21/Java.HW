package hw3.ex3;

import javax.swing.JOptionPane;

public class HW3Ex3 {
    
    private final static int one = 1;
    
    private final static int two = 2;
    
    private final static int three = 3;
    
    private final static int four = 4;
    
    private final static int five = 5;

    public static void main(String[] args) {
        Hash hash = new Hash();
        JOptionPane.showMessageDialog(null, "Your are going to use Hash - Program \n"
                + "Chose, what action do you want to do and input a Key - number : \n"
                + "1 : add a new hash - element \n"
                + "2 : delete a hash - element \n"
                + "3 : watch all elements \n"
                + "4 : check the element entry\n"
                + "5 : exit \n");
        int answer = Integer.parseInt(JOptionPane.showInputDialog("Please, input a Key - number"));
        String strIn;
        while (answer != five) {
            switch (answer) {
                case one:
                    strIn = JOptionPane.showInputDialog("Please, input the value,that you wanna add");
                    hash.addElement(strIn);
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Please, input a Key - number"));
                    break;
                case two:
                    strIn = JOptionPane.showInputDialog("Please, input the value,that you wanna delete");
                    hash.deleteElement(strIn);
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Please, input a Key - number"));
                    break;
                case three:
                    hash.hashOutput();
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Please, input a Key - number"));
                    break;
                case four:
                    strIn = JOptionPane.showInputDialog("Please, input the value,that you wanna check");
                    hash.hashEntry(strIn);
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Please, input a Key - number"));
                    break;
            }
        }
    }
}
