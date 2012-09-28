package hw10.ex2.network;

/**
 * Chrome OS description
 */
public class Chrome extends OS{
    
    /**
     * Constructor
     */
    public Chrome(boolean status) {
        this.infectionStatus = status;
        this.infectionAbility = 25;
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
