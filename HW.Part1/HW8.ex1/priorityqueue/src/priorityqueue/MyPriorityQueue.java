package priorityqueue;

/**
 * This is an example of priority queue class.
 * High priority items have low 'prio' value, i.e. ("str1", 0) > ("str2", 1)
 * @author Author
 */
public class MyPriorityQueue<TypeValue> {
    
    /**
     * Class for elements of MyPriorityQueue 
     */
    private class QueueElement {
        
        /**
         * Constructor
         */
        public QueueElement() {
            value = null;
            next = null;
            prio = 0;
        }
        
        /**
         * Another constructor
         * @param value of element
         * @param priority of element
         */
        public QueueElement(TypeValue value, int priority) {
            this.next = null;
            this.value = value;
            this.prio = priority;
        }
        
        /**
         * Get next queue element
         */
        public QueueElement getNext() {
            return next;
        }
        
        /**
         * Set new next element 
         * @param nxt connected element
         */
        public void setNext(QueueElement nxt) {
            next = nxt;
        }
        
        /**
         * Get queue element's value
         */
        public TypeValue getValue() {
            return value;
        }
        
        /**
         * Get queue element's priority
         * @return 
         */
        public int getPrio() {
            return prio;
        }
        
        private TypeValue value;         
        
        private QueueElement next;  
        
        private int prio;          
    }

    
    /**
     * Constructor
     */
    public MyPriorityQueue() {
        head = new QueueElement(); 
    }

    /**
     * Addition element to the queue
     * @param val value of element
     * @param prio priority of element
     */
    public void enqueue(TypeValue val, int prio) {
        QueueElement current = head;
        while (current.getNext() != null && current.getNext().getPrio() < prio) {
            current = current.getNext();
        }
        QueueElement tmp = new QueueElement(val, prio);
        tmp.setNext(current.getNext());
        current.setNext(tmp);
    }

    /**
     * Get element's with the smallest priority value
     * @return value 
     * @throws Exception 
     */
    public TypeValue dequeue() throws EmptyQueueException {
        if (head.getNext() == null) {
            throw new EmptyQueueException("Queue is empty!!!");
        } else {
            QueueElement tmp = head.getNext();
            head = tmp;
            return tmp.getValue();
        }
    }
    
    private QueueElement head;
}
