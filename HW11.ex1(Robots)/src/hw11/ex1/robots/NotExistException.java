package hw11.ex1.robots;

/**
 * Prevent problems with elements, which don't exist
 */
public class NotExistException extends Exception {

    public NotExistException() {
    }

    public NotExistException(String msg) {
        super(msg);
    }
}
