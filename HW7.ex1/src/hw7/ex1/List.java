package hw7.ex1;

import java.util.Iterator;

public class List<ValueType> implements Iterable<ValueType>{

    /**
     * Constructor
     */
    public List() {
        ListElement<ValueType> guard = new ListElement<>(null);
        stepIterator = new iterator();
        head = guard;
        tail = guard;
        count = 0;
    }

    /**
     * Connectin' iterator to the List 
     * @return iterator
     */
    @Override
    public Iterator<ValueType> iterator() {
        return stepIterator; 
    }

    private class iterator implements Iterator<ValueType> {

        /**
         * Constructor
         */
        public iterator() {
            this.current = head;
        }

        /**
         * Chech existence of next element
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            return this.current.next != null;
        }

        /**
         * Make transfer to the link
         */
        @Override
        public void remove() {
            this.current = current.next;
        }

        /**
         * Get next element value
         *
         * @return
         */
        @Override
        public ValueType next() {
            return this.current.next.value;
        }
        
        private ListElement<ValueType> current;
        
    }

    /**
     * Addition in the end
     *
     * @param value element value
     */
    public void addToEnd(ValueType value) {
        ListElement<ValueType> current = new ListElement<>(value);
        tail.next = current;
        tail = current;
        count++;
    }

    /**
     * Addition in the beginning
     *
     * @param value element value
     */
    public void addToStart(ValueType value) {
        ListElement<ValueType> current = new ListElement<>(value);
        current.next = head.next;
        head.next = current;
        count++;
    }

    /**
     * Check for existing
     *
     * @param value element value
     */
    public boolean exist(ValueType value) {
        if (!isEmpty()) {
            Iterator<ValueType> step = new iterator();
            while (step.hasNext()) {
                if (step.next() == value) {
                    return true;
                }
                step.remove();
            }
        }
        return false;
    }

    /**
     * get selected element value
     *
     * @param value element value
     */
    public ValueType getValue(int place) throws NotExistException {
        Iterator<ValueType> step = new iterator();
        if (place <= count) {
            for (int i = 1; i < place; i++) {
                step.remove();
            }
            return step.next();
        } else {
            throw new NotExistException("Element at the current place doesn't exist!");
        }
    }

    /**
     * Delete selected element
     *
     * @param value element value
     */
    public void deleteElement(ValueType value) throws NotExistException {
        ListElement<ValueType> previous = head;
        ListElement<ValueType> current = head.next;
        if (exist(value)) {
            while (current != tail.next) {
                if (current.value == value) {
                    previous.next = current.next;
                    count--;
                    return;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        } else {
            throw new NotExistException("Element with current value doesn't exist!");
        }
    }

    /**
     * List output
     */
    public void output() {
        if (!isEmpty()) {
            for (ValueType current : this) {
                System.out.print(current + " ");
            }
            System.out.println();
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
     * Get the List length
     */
    public int listAmount() {
        return count;
    }

    /**
     * Check for void
     */
    public boolean isEmpty() {
        return count == 0;
    }
    
    private iterator stepIterator;
    
    private ListElement<ValueType> head;
    
    private ListElement<ValueType> tail;
    
    private int count;

    /**
     * Class for a element of List
     * @param <ValueType> element's value type
     */
    public class ListElement<ValueType> {

        public ListElement(ValueType value) {
            this.next = null;
            this.value = value;
        }
        
        public ValueType value;
        
        public ListElement<ValueType> next;
    }
}
