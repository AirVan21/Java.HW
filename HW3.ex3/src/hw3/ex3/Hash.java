package hw3.ex3;

public class Hash {
    
    private final int length = 37 ;
    
    public List hashTable[];
    
    public Hash() {
        for (int i = 1; i <= length; i++) {
            hashTable[i] = new List();
        }

    }
    
}
