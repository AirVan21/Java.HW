package hw3.ex4;

public class originalHashFunction extends HashFunction {

    /**
     * Counting hash function for a string
     *
     * @param line given string
     * @param hashLength hash length
     * @return hash function value
     */
    @Override
    public int originalHashFunction(String line, int hashLength) {
        return Math.abs(line.hashCode() % hashLength);
    }
}
