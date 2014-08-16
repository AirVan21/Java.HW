package hw7.ex2;

/**
 * Prevent using some actions in a wrong place 
 */
public class WrongActionException extends Exception {

    public WrongActionException() {
    }

    public WrongActionException(String msg) {
        super(msg);
    }
}
