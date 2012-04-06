package controlwork1;

/**
 * Prevent geting value from empty queue
 */
public class AskFromEmpty extends Exception {

    public AskFromEmpty() {
    }

    public AskFromEmpty(String msg) {
        super(msg);
    }
}
