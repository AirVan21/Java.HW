package hw10.ex1;

public class Stack<TreeValue> {

    /**
     * Constructor
     */
    public Stack() {
        head = null;
        count = 0;
    }

    public void push(TreeValue value, int id, TreeElement<TreeValue> leftSon, TreeElement<TreeValue> rightSon) {
        TreeElement<TreeValue> lastAdded = new TreeElement<>(value, id);
        lastAdded.setLeftSon(leftSon);
        lastAdded.setRightSon(rightSon);
        lastAdded.setNext(head);
        head = lastAdded;
        count++;
    }

    /**
     * Pop head element
     */
    public void pop() {
        if (this.count != 0) {
            head = head.getNext();
            count--;
        } else {
            // throw exception;
        }
    }

    /**
     * Gets value
     *
     * @return
     */
    public TreeElement<TreeValue> top() {
        if (head != null) {
            return head;
        }
        return null;
    }
    
    private TreeElement<TreeValue> head;
    
    /**
     * Amount of stack elements
     */
    private int count;
}