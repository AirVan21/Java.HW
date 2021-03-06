package hw10.ex2.network;

/**
 * Chrome OS description
 */
public class Chrome implements OS{
    
    /**
     * Constructor
     */
    public Chrome(boolean status, int infectionPercent) {
        this.infectionStatus = status;
        // such primary values just to test system
        this.infectionAbility = infectionPercent;
        this.random = new Randomizer(this.infectionAbility);
    }
    
    @Override
    public boolean isInfected() {
        return this.infectionStatus;
    }
    
    @Override
    public void virusAttack(int iterationNum) {
        if (updateInfectionStatus && iterationNum != this.timeOfUpdate) {
            this.infectionStatus = true;
        } else {
            if (random.getResult()) {
                this.updateInfectionStatus = true;
                this.timeOfUpdate = iterationNum;
            }
        }
    }
    
    @Override
    public final int infectionAbility() {
        return this.infectionAbility;
    }
    
    /**
     * Is infected of not
     */
    private boolean infectionStatus;
    
    /**
     * Gives information about virus possibility
     */
    private int infectionAbility;
    
    /**
     * Random for our network
     */
    private Randomizer random;
    
    /**
     * For discret mode
     */
    private boolean updateInfectionStatus;
    
    private int timeOfUpdate;
}
