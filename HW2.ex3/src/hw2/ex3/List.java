package hw2.ex3;

public class List {
    
    final int first = 1;
    final int error = 100500;
    
    public void addToEnd(int value) {
        ListElement current = new ListElement();
        current.next = null;
        current.value = value;
        if (count == 0) {
            head = current;
        } else {
            tail.next = current;
        }
        tail = current;
        count++;

    }

    public void addToStart(int value) {
        ListElement current = new ListElement();
        current.next = null;
        current.value = value;
        if (count == 0) {
            head = current;
            tail = current;
        } else {
            ListElement help = new ListElement();
            help = head;
            head = current;
            head.next = help;
        }
        count++;

    }
    
    public void addToPosition(int place, int value) {
        ListElement current = new ListElement();
        int nextCount = count + 1;
        current.next = null;
        current.value = value;
        if (place == first) {
            addToStart(value);
        } else  if (place == nextCount) {
            addToEnd(value);
        } else if (place < nextCount) {        
            ListElement help = new ListElement();
            ListElement previous = new ListElement();
            help = head;
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
    
    public int getValue(int place) {
        ListElement current = new ListElement();
        current = head;
        if (place <= count) {
            for (int i = 1; i < place; i++) {
                current = current.next;
            }
            return current.value;
        } else {
            return error;
        }
    }

    public void deleteElement(int value) {
        ListElement current = new ListElement();
        ListElement previous = new ListElement();
        previous = head;
        current = head.next;
        if (previous.value == value) {
            head = head.next;
            count--;
        } else {
            while (current != tail.next) {
                if (current.value == value) {
                    ListElement help = new ListElement();
                    help = current.next;
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
    
    public void deleteList() {
        head = null;
    }

    public void output() {
        ListElement current = new ListElement();
        current = head;
        while (current != tail.next) {
            System.out.print(Integer.toString(current.value) + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int listAmount() {
        return count;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean inCheck(int value) {
        ListElement current = new ListElement();
        current = head;
        while (current != tail.next) {
            if (current.value == value) {
                return true;
            }
        }
        return false;
    }


    private void List() {
        head = null;
        tail = null;
        count = 0;
    }
    
    private ListElement head;
    
    private ListElement tail;
    
    private int count;
}
