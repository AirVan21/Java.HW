package hw10.ex1;

/**
 * Prevent duplication
 */
public class AlreadyExistException extends Exception {

    /**
     * Creates a new instance of
     */
    public AlreadyExistException() {
    }

    /**
     * Constructs an instance of
     * <code>AlreadyExistException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public AlreadyExistException(String msg) {
        super(msg);
    }
}
