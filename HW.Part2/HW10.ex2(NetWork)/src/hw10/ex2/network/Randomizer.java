package hw10.ex2.network;

import java.util.Random;

/**
 * Give us random solution
 */
public class Randomizer {
    
    /**
     * Constructor
     * @param possibility 
     */
    public Randomizer(int possibility) {
        this.answer = false;
        this.chance = possibility;
        this.random = new Random();
    }
    
    /**
     * Gives random test solution
     */
    public boolean getResult() {
        int help = random.nextInt(100);
        if (help < this.chance) {
            this.answer = true;
        }
        return answer;
    }
    
    /**
     * Answer about infection
     */
    private boolean answer;
    
    /**
     * Virus attack success
     */
    private int chance;
    
    /**
     * current Random function
     */
    private Random random;
}
