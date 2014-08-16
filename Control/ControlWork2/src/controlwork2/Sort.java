package controlwork2;

/**
 * @author AirVan
 */
public class Sort<ValueType> {
    
    /**
     * Constructor
     * @param list
     * @param compare 
     */
    public Sort(List<ValueType> list, Comparator<ValueType> compare) {
        this.currentList = list;
        this.compareTool = compare;     
    }
    
    /**
     *  Bubble sort
     * @return 
     */
    public List<ValueType> getSortedList() {
        ListElement<ValueType> current = currentList.getHead();
        while (current.getNext() != null) {
            ListElement<ValueType> help = currentList.getHead();
            while (help.getNext() != null) {
                if (compareTool.firstBigger(help, help.getNext())) {
                    changeValue(help,help.getNext());
                }
                help = help.getNext();
            }
            current = current.getNext();
        }       
        return currentList;
    }
    
    /**
     * Change value for 2 ListElements
     * @param value1
     * @param value2 
     */
    private void changeValue(ListElement<ValueType> value1, ListElement<ValueType> value2) {
        ValueType saver1 = value1.getValue();
        int saver2 = value1.getKey();
        value1.setKey(value2.getKey());
        value1.setValue(value2.getValue());
        value2.setKey(saver2);
        value2.setValue(saver1);
    }
    
    private List<ValueType> currentList;
    
    private Comparator<ValueType> compareTool;
}
