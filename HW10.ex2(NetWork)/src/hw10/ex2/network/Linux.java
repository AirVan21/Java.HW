package hw10.ex2.network;

/**
 * Linux OS description
 */
public class Linux implements OS{   
    
    /**
     * Constructor
     */
    public Linux(boolean status, int infectionPercent) {
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
    public void virusAttack() {
        if (updateInfectionStatus) {
            this.infectionStatus = true;
        } else {
            if (random.getResult()) {
                this.updateInfectionStatus = true;
            }
        }
    }
    
    @Override
    public int infectionAbility() {
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

}
