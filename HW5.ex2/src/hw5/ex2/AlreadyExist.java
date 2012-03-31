package hw5.ex2;

/**
 * Prevent duplication
 */
public class AlreadyExist extends Exception {

    public AlreadyExist() {
    }

    public AlreadyExist(String msg) {
        super(msg);
    }
}
