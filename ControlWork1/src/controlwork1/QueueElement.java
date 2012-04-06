package controlwork1;

public class QueueElement<ValueType>{
    
    /**
     * Constructor
     * @param value of QueueElement
     * @param priority of QueueElement
     */
    public QueueElement(ValueType value, int priority){
        this.priority = priority;
        this.value = value;
        this.next = null;
    }

    /**
     * get QueueElement value
     */
    public ValueType getValue() {
        return this.value;
    }
    
    /**
     * get QueueElement priority
     */
    public int getPriority() {
        return this.priority;
    }

    /**
     * get QueueElement link
     *
     * @param current selected element
     * @return
     */
    public QueueElement next() {
        return next;
    }

    /**
     * connect two QueueElements
     *
     * @param connect QueueElement which shoul be connected
     * @param value connection place
     */
    public void connectNext(QueueElement value) {
        next = value;
    }
    
    /**
     * priority should be > 0
     */
    private int priority;
    
    private ValueType value; 
    
    private QueueElement next;
}
