package priorityqueue;

/**
 * @author Author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        MyPriorityQueue<Integer> intQueue = new MyPriorityQueue<Integer>();

        // enqueue some numbers
        intQueue.enqueue(5, 1);
        intQueue.enqueue(10, 0);
        intQueue.enqueue(15, 3);

        // dequeue them and print to console
        while (true) {
            try {
                System.out.println(intQueue.dequeue());
            } catch (EmptyQueueException e) {
                System.out.println(e.toString());
                break;
            }
        }
        System.out.println("finish");
    }
}
