package hw3.ex3;


public class List {
    
    public final int error = 100500;
    
    /** constructor
     */
    public List() {
        head = null;
        tail = null;
        count = 0;
    }
    
    /** addition to the end 
     * @param value element value
     */
    public void addToEnd(int value) {
        ListElement current = new ListElement(value);
        if (count == 0) {
            head = current;
        } else {
            tail.next = current;
        }
        tail = current;
        count++;
    }

    /** addition to the beginning
     * @param value element value
     */
    public void addToStart(int value) {
        ListElement current = new ListElement(value);
        if (count == 0) {
            head = current;
            tail = current;
        } else {
            ListElement help = head;
            head = current;
            head.next = help;
        }
        count++;
    }
    
    /** addition to the selected place 
     * @param place place number
     * @param value element value
     */
    public void addToPosition(int place, int value) {
        ListElement current = new ListElement(value);
        int nextCount = count + 1;
        if (place == first) {
            addToStart(value);
        } else  if (place == nextCount) {
            addToEnd(value);
        } else if (place < nextCount) {        
            ListElement help = head;
            ListElement previous = head;
            for (int i = 1; i < place; i++) {
                previous = help;
                help = help.next;
            }
            previous.next = current;
            current.next = help;
            count++;       
        } else {
            System.out.println("Wrong place!");
        }                        
    }
    
    /** get selected element value  
     @param value element value 
     */  
    public int getValue(int place) {
        ListElement current = head;
        if (place <= count) {
            for (int i = 1; i < place; i++) {
                current = current.next;
            }
            return current.value;
        } else {
            return error;
        }
    }

    /** delete selected element 
     * @param value element value
     */
    public void deleteElement(int value) {
        ListElement current = head.next;
        ListElement previous = head;
        if (previous.value == value) {
            head = head.next;
            count--;
        } else {
            while (current != tail.next) {
                if (current.value == value) {
                    ListElement help = current.next;
                    previous.next = help;
                    previous = help;
                    current = help.next;
                    count--;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        }
    }
    
    /** List deletion*/
    public void deleteList() {
        head = null;
    }

    /** List output */
    public void output() {
        ListElement current = head;
        while (current != tail.next) {
            System.out.print(Integer.toString(current.value) + " ");
            current = current.next;
        }
        System.out.println();
    }

    /** get the List length */
    public int listAmount() {
        return count;
    }
    /** check for void */
    public boolean isEmpty() {
        return count == 0;
    }
    /** check for existing  
     * @param value element value
     */
    public boolean listEntry(int value) {
        ListElement current = head;
        while (current != tail.next) {
            if (current.value == value) {
                return true;
            }
        }
        return false;
    }
    
    private ListElement head;
    
    private ListElement tail;
    
    private int count;
    
    private final int first = 1;
}
