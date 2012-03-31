package hw5.ex2;

public class List {

    /**
     * Сonstructor
     */
    public List() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Addition to the end
     *
     * @param value element value
     */
    public void addToEnd(String value) throws AlreadyExist { 
        if (!this.exists(value)) {
            ListElement current = new ListElement(value);
            if (count == 0) {
                head = current;
            } else {
                tail.connectNext(current);
            }
            tail = current;
            count++;
        } else {
            throw new AlreadyExist("Alredy exist in List");

        }
    }

    /**
     * Addition to the beginning
     *
     * @param value element value
     */
    public void addToStart(String value) throws AlreadyExist {
        if (!this.exists(value)) {
            ListElement current = new ListElement(value);
            if (count == 0) {
                head = current;
                tail = current;
            } else {
                current.connectNext(head);
                head = current;
            }
            count++;
        } else {
            throw new AlreadyExist("Alredy exist in List");
        }
    }

    /**
     * Get selected element value
     *
     * @param value element value
     */
    public String getValue(int place) throws NotExist{
        if (place <= count) {
            ListElement current = head;
            for (int i = 1; i < place; i++) {
                current = current.next();
            }
            return current.getValue();
        } else {
            throw new NotExist("Element with such id doesn't exist");
        }
    }

    /**
     * Delete selected element
     *
     * @param value element value
     */
    public void deleteElement(String value) throws NotExist {
        if (this.exists(value)) {
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
        } else {
            throw new NotExist("Element that you want to deleted doesn't exist");
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
     * Get the List length
     */
    public int listAmount() {
        return count;
    }

    /**
     * Check for emptiness
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Check for existing
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
