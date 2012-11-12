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
    }
    
    @Override
    public boolean isInfected() {
        return this.infectionStatus;
    }
    
    @Override
    public void virusAttack() {
        Randomizer random = new Randomizer(this.infectionAbility());
        if (random.getResult()) {
            infectionStatus = true;
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

}
