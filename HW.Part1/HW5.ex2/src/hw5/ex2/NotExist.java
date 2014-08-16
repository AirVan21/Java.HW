package hw5.ex2;

/**
 * Prevent using uncreated elements
 */
public class NotExist extends Exception {

    public NotExist() {
    }

    public NotExist(String msg) {
        super(msg);
    }
}
