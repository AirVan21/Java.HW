package controlwork1;

public class Queue {
    
    public Queue(){
        this.head = null;
        this.tail = null;
        this.count = 0;
    }
    
    /**
     * Add elements into Queue
     * @param value
     * @param priority 
     */
    public void enqueue(Object value, int priority) {
        QueueElement current = new QueueElement(value, priority);
        if (count == 0) {
            head = current;
        } else {
            tail.connectNext(current);
        }
        tail = current;
        count++;
    }
    
    /**
     * Get QueueElement's value with biggest priority and delete it
     * @return QueueElement's value
     * @throws AskFromEmpty 
     */
    public Object dequeue() throws AskFromEmpty {
        if (count > 0) {
            QueueElement previous = head;
            QueueElement current = head.next();
            if (previous == searchMax()) {
                head = head.next();
                count--;
                return previous.getValue();
            } else {
                while (current != searchMax()) {
                    previous = current;
                    current = current.next();
                }
                QueueElement help = current;
                previous.connectNext(current.next());
                count--;
                return help.getValue();
            }
        } else {
            throw new AskFromEmpty("Queue is empty!");
        }
    }
    
    /**
     * Searcj max Queue element by it's priority
     * @return 
     */
    private QueueElement searchMax(){
        QueueElement current = head;
        QueueElement maxQueueElement = head;
        while (current != tail.next()) {
            if (current.getPriority() > maxQueueElement.getPriority()) {
                maxQueueElement = current;
            }
            current = current.next();
        }
        return maxQueueElement;
    }
    
    private QueueElement head;
    
    private QueueElement tail;
    
    private int count;
}
