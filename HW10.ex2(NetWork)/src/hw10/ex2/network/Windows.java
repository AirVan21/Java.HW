package hw10.ex2.network;

/**
 * Windows OS description
 */
public class Windows extends OS{
    
    /**
     * Constructor
     */
    public Windows() {
        this.infectionStatus = false;
        this.infectionAbility = 40;
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
