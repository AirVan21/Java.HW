package hw6.ex1;

/**
 * Prevent division by zero
 */
public class DivisionByZeroException extends Exception {

    public DivisionByZeroException() {
    }

    public DivisionByZeroException(String msg) {
        super(msg);
    }
}
