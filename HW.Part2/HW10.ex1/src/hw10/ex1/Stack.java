package hw10.ex1;

public class Stack<TreeValue> {

    /**
     * Constructor
     */
    public Stack() {
        head = null;
    }

    /**
     * Push TreeElement
     * @param value value of element
     * @param id id of element
     * @param leftSon left son of element
     * @param rightSon right son of element
     */
    public void push(TreeValue value, int id, TreeElement<TreeValue> leftSon, TreeElement<TreeValue> rightSon) {
        TreeElement<TreeValue> lastAdded = new TreeElement<>(value, id);
        lastAdded.setLeftSon(leftSon);
        lastAdded.setRightSon(rightSon);
        lastAdded.setNext(head);
        head = lastAdded;
    }

    /**
     * Pop head element
     */
    public void pop() {
        if (this.head != null) {
            head = head.getNext();
        }
    }

    /**
     * Gets value
     *
     * @return TreeElement
     */
    public TreeElement<TreeValue> top() {
        if (head != null) {
            return head;
        }
        return null;
    }
    
    /**
     * Head stack element
     */
    private TreeElement<TreeValue> head;
}