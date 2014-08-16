package hw2.ex3;

public class List {
    
    public final int error = 100500;
    
    /** добавление элемента в конец списка 
     * @param value значение элемента
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

    /** добавление элемента в начало списка 
     * @param value значение элемента
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
    
    /** добавление элемента в список на определённую позицию 
     * @param place номер позиции элемента
     * @param value значение элемента
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
    
    /** получение значения элемента списка, находящегося на некоторой позиции  
     @param value значение элемента 
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

    /** удаление элемента списка с данным значение 
     * @param value значение элемента
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
    
    /** удаление списка*/
    public void deleteList() {
        head = null;
    }

    /** вывод значений элементов списка на экран */
    public void output() {
        ListElement current = head;
        while (current != tail.next) {
            System.out.print(Integer.toString(current.value) + " ");
            current = current.next;
        }
        System.out.println();
    }

    /** возвращение длины списка */
    public int listAmount() {
        return count;
    }
    /** проверка списка на  пустоту */
    public boolean isEmpty() {
        return count == 0;
    }
    /** проверка существования элемента списка с заданныйм значением 
     * @param value значение элемента
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


    public  List() {
        head = null;
        tail = null;
        count = 0;
    }
    
    private ListElement head;
    
    private ListElement tail;
    
    private int count;
    
    private final int first = 1;
}
