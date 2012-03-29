package hw5.ex1;

public class WrongStructure extends Exception {

    /**
     * Creates a new instance of
     * <code>WrongStructure</code> without detail message.
     */
    public WrongStructure() {
    }

    /**
     * Constructs an instance of
     * <code>WrongStructure</code> with the specified detail message
     * @param msg the detail message.
     */
    public WrongStructure(String msg) {
        super(msg);
    }
}
