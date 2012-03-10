package hw3.ex3;

import javax.swing.JOptionPane;

public class Hash {
    
    /**
     * hash table constructor
     */
    public Hash() {
        hashTable = new List[length];
        for (int i = 0; i < length; i++) {
            hashTable[i] = new List();
        }
    }
    
    public List hashTable[];
    
    /**
     * Add element to hashTable 
     * @param value element value
     */
    public void addElement(String value) {
        int codeValue = Math.abs(value.hashCode() % length);
        hashTable[codeValue].addToEnd(value);
    }
    
    /**
     *delete element from hash 
     * @param value element value 
     */
    public void deleteElement(String value) {
        int codeValue = Math.abs(value.hashCode() % length);
        if (hashTable[codeValue].listEntry(value)) {
            hashTable[codeValue].deleteElement(value);
        } else {
            JOptionPane.showMessageDialog(null, "This element wasn't found !");
        }
    }
    
    /**
     * cheking element for existing in hash
     * @param value element value 
     */
    public void hashEntry(String value) {
        int codeValue = Math.abs(value.hashCode() % length);
        if (hashTable[codeValue].listEntry(value)) {
            JOptionPane.showMessageDialog(null, "Yes, it's here!");
        } else {
            JOptionPane.showMessageDialog(null, "This element wasn't found !");
        }

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
         JOptionPane.showMessageDialog(null, "Take a look at the console!");
    }
    private final int length = 31;
}
