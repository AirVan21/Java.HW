package hw3.ex4;

import javax.swing.JOptionPane;

public class Hash {
    
    /**
     * hash table constructor
     */
    public Hash(HashFunctionInterface hashCounter) {
        this.hashTable = new List[length];
        for (int i = 0; i < length; i++) {
            hashTable[i] = new List();
        }
        this.hashCounter = hashCounter;
    }
    
    /**
     * Add element to hashTable 
     * @param value element value
     */
    public void addElement(String value) {
        hashTable[hashCounter.originalHashFunction(value, length)].addToEnd(value);
    }
    
    /**
     *delete element from hash 
     * @param value element value 
     */
    public void deleteElement(String value) {
        int codeValue = hashCounter.originalHashFunction(value, length);
        if (exists(value)) {
            hashTable[codeValue].deleteElement(value);
        } 
    }
    
    /**
     * cheking element for existing in hash
     * @param value element value 
     */
    public boolean exists(String value) {
        int codeValue = hashCounter.originalHashFunction(value, length);
        return hashTable[codeValue].exists(value);
    }
    
    /**
     * showing all hash elements
     */
    public void hashOutput() {
        for (int i = 0; i < length; i++) {
            if (!hashTable[i].isEmpty()) {
                hashTable[i].output();
            }
        }
    }
    
    private final int length = 31;
    
    private List hashTable[];
    
    private HashFunctionInterface hashCounter;
}
