package hw10.ex2.network;

/**
 * Linux OS description
 */
public class Linux extends OS{   
    
    /**
     * Constructor
     */
    public Linux(boolean status) {
        this.infectionStatus = status;
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
