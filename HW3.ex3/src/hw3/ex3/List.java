package hw3.ex3;

import javax.swing.JOptionPane;

public class List {

    /**
     * constructor
     */
    public List() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * addition to the end
     *
     * @param value element value
     */
    public void addToEnd(String value) {
        ListElement current = new ListElement(value);
        if (count == 0) {
            head = current;
        } else {
            tail.connectNext(current);
        }
        tail = current;
        count++;
    }

    /**
     * addition to the beginning
     *
     * @param value element value
     */
    public void addToStart(String value) {
        ListElement current = new ListElement(value);
        if (count == 0) {
            head = current;
            tail = current;
        } else {
            current.connectNext(head);
            head = current;
        }
        count++;
    }

    /**
     * get selected element value
     *
     * @param value element value
     */
    public String getValue(int place) {
        ListElement current = head;
        if (place <= count) {
            for (int i = 1; i < place; i++) {
                current = current.next();
            }
            return current.getValue();
        } else {
            return "error";
        }
    }

    /**
     * delete selected element
     *
     * @param value element value
     */
    public void deleteElement(String value) {
        ListElement previous = head;
        ListElement current = head.next();
        if (previous.getValue().equals(value)) {
            head = head.next();
            count--;
        } else {
            while (current != tail.next()) {
                if (current.getValue().equals(value)) {
                    ListElement help = current.next();
                    previous.connectNext(help);
                    previous = help;
                    current = help.next();
                    count--;
                } else {
                    previous = current;
                    current = current.next();
                }
            }
        }
    }

    /**
     * List deletion
     */
    public void deleteList() {
        count = 0;
        head = null;
        tail = null;
    }

    /**
     * List output
     */
    public void output() {
        ListElement current = head;
        while (current != tail.next()) {
            System.out.print(current.getValue() + " ");
            current = current.next();
        }
        System.out.println();
    }

    /**
     * get the List length
     */
    public int listAmount() {
        return count;
    }

    /**
     * check for void
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * check for existing
     *
     * @param value element value
     */
    public boolean exists(String value) {
        if (!isEmpty()) {
            ListElement current = head;
            while (current != tail.next()) {
                if (current.getValue().equals(value)) {
                    return true;
                }
                current = current.next();
            }
        }
        return false;
    }
    private ListElement head;
    
    private ListElement tail;
    
    private int count;
    
    
}
