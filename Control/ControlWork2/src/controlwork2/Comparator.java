package controlwork2;

/**
 * Checking equals
 */
public class Comparator<ValueType> {
    
    /**
     * Constructor
     * @param value1
     * @param value2 
     */
    public Comparator() { 
    }
    
    /**
     * Ckeck if the first element bigger
     * @param value1
     * @param value2
     * @return 
     */
    public boolean firstBigger(ListElement<ValueType> value1, ListElement<ValueType> value2) {
        return value1.getKey() > value2.getKey();
    }
    
}
