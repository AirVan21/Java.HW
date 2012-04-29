package priorityqueue;

/**
 * Prevent asking elements from empty queue 
 */
public class EmptyQueueException extends Exception {
    public EmptyQueueException() {
        super();
    }
    public EmptyQueueException(String str) {
        super(str);
    }
}
