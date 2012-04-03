package hw5.ex1;

/**
 * Prevent using wrong symbols
 */
public class IncorrectSymbol extends Exception {

    public IncorrectSymbol() {
    }

    public IncorrectSymbol(String msg) {
        super(msg);
    }
}
