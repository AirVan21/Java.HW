package hw5.ex1;

public class IncorrectSymbol extends Exception {

    /**
     * Creates a new instance of
     * <code>IncorrectSymbol</code> without detail message.
     */
    public IncorrectSymbol() {
    }

    /**
     * Constructs an instance of
     * <code>IncorrectSymbol</code> with the specified detail message.
     * @param msg the detail message.
     */
    public IncorrectSymbol(String msg) {
        super(msg);
    }
}
