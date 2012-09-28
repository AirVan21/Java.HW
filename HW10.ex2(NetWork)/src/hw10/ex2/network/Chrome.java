package hw10.ex2.network;

/**
 * Chrome OS description
 */
public class Chrome implements OS{
    
    /**
     * Constructor
     */
    public Chrome(boolean status) {
        this.infectionStatus = status;
        this.infectionAbility = 10;
    }
    
    @Override
    public boolean isInfected() {
        return this.infectionStatus;
    }
    
    @Override
    public void virusAttack() {
        Randomizer random = new Randomizer(this.infectionAbility);
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
