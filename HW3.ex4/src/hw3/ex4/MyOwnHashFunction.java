package hw3.ex4;

public class MyOwnHashFunction extends HashFunction {

    /**
     * Counting hash function for a string
     *
     * @param line given string
     * @param hashLength hash length
     * @return hash function value
     */
    @Override
    public int myOwnHashFunction(String line, int hashLength) {
        int currentHash = line.charAt(0);
        for (int i = 1; i < line.length(); i++) {
            currentHash = currentHash * simpleNumber + line.charAt(i);
        }
        return Math.abs(currentHash % hashLength);
    }
    private final int simpleNumber = 7;
}
