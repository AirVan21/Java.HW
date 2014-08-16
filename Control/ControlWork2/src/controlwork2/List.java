package controlwork2;

import java.util.Iterator;

public class List<ValueType> implements Iterable<ValueType>{

    /**
     * Constructor
     */
    public List() {
        ListElement<ValueType> guard = new ListElement<>(null, 0);
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
        return new ListIterator();
    }

    private class ListIterator implements Iterator<ValueType> {

        /**
         * Constructor
         */
        public ListIterator() {
            this.current = head;
        }

        /**
         * Chech existence of next element
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            return this.current.getNext() != null;
        }

        /**
         * Make transfer to the link
         */
        @Override
        public void remove() {
            this.current = current.getNext();
        }

        /**
         * Get next element value
         *
         * @return
         */
        @Override
        public ValueType next() {
            ValueType help = this.current.getNext().getValue();
            this.remove();
            return help;
        }
        
        private ListElement<ValueType> current;
        
    }

    /**
     * Addition in the end
     *
     * @param value element value
     */
    public void addToEnd(ValueType value, int key) {
        ListElement<ValueType> current = new ListElement<>(value, key);
        tail.setNext(current);
        tail = current;
        count++;
    }

    /**
     * Addition in the beginning
     *
     * @param value element value
     */
    public void addToStart(ValueType value, int key) {
        ListElement<ValueType> current = new ListElement<>(value, key);
        current.setNext(head.getNext());
        head.setNext(current);
        count++;
    }

    /**
     * Check for existing
     *
     * @param value element value
     */
    public boolean exist(ValueType value) {
        if (!isEmpty()) {
            for (ValueType current : this) {
                if (current == value) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /**
     * get selected element value
     *
     * @param value element value
     */
    public ValueType getValue(int place) throws NotExistException {
        Iterator<ValueType> step = new ListIterator();
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
        ListElement<ValueType> current = head.getNext();
        if (exist(value)) {
            while (current != tail.getNext()) {
                if (current.getValue() == value) {
                    previous.setNext(current.getNext());
                    count--;
                    return;
                } else {
                    previous = current;
                    current = current.getNext();
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
    
    public ListElement<ValueType> getHead() {
        return this.head;
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
    
    private ListElement<ValueType> head;
    
    private ListElement<ValueType> tail;
    
    private int count;
}
