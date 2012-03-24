package hw3.ex4;

public interface HashFunctionInterface {

    /**
     * Counting hash function for a string
     *
     * @param line given string
     * @param hashLength hash length
     * @return hash function value
     */
    public int originalHashFunction(String line, int hashLength);

    /**
     * Counting hash function for a string
     *
     * @param line given string
     * @param hashLength hash length
     * @return hash function value
     */
    public int myOwnHashFunction(String line, int hashLength);
}
