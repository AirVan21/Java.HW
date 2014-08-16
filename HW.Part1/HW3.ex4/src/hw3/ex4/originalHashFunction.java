package hw3.ex4;

public class originalHashFunction implements HashFunctionInterface {

    /**
     * Counting hash  for a string
     *
     * @param line given string
     * @param hashLength hash length
     * @return hash function value
     */
    @Override
    public int hashCounter(String line, int hashLength) {
        return Math.abs(line.hashCode() % hashLength);
    }
}
