package hw3.ex4;

public interface HashFunctionInterface {
    
    /**
     * Counting hash for a string
     * @param line current string
     * @param hashLength length of Hash
     * @return  hash function value
     */
    public int hashCounter(String line, int hashLength);
}
