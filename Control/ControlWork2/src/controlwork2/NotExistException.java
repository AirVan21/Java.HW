package controlwork2;

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
