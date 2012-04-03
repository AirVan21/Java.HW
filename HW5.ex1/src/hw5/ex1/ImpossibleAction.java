package hw5.ex1;

/**
 * Prevet unexpected using of methods 
 */
public class ImpossibleAction extends Exception {

    public ImpossibleAction() {
    }

    public ImpossibleAction(String msg) {
        super(msg);
    }
}
