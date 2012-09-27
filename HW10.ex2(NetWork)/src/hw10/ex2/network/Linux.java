package hw10.ex2.network;

/**
 * Linux OS description
 */
public class Linux extends OS{   
    
    /**
     * Constructor
     */
    public Linux() {
        this.infectionStatus = false;
        this.infectionAbility = 15;
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
