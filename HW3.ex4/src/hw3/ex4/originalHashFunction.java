package hw3.ex4;

public class originalHashFunction extends HashFunction {

    public int originalHashFunction(String line, int hashLength) {
        return Math.abs(line.hashCode() % hashLength);
    }

    public int myOwnHashFunction(String line, int hashLength) {
        int currentHash = line.charAt(0);
        for (int i = 1; i < line.length(); i++) {
            currentHash = currentHash * simpleNumber + line.charAt(i);
        }
        return Math.abs(currentHash % hashLength);
    }
    
    private final int simpleNumber = 7;
}
