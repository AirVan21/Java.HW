package hw5.ex1;

/**
 * Prevent wrong entry of expression
 */
public class WrongStructure extends Exception {

    public WrongStructure() {
    }

    public WrongStructure(String msg) {
        super(msg);
    }
}
