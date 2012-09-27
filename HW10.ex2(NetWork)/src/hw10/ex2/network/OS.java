package hw10.ex2.network;

/**
 * Describes methods in operation system
 */
public class OS {

    /**
     * Answers about virus existence
     *
     * @return
     */
    public boolean isInfected() {
        return this.infectionStatus;
    }

    /**
     * Gives virus infection opportunity
     *
     * @return
     */
    public int infectionAbility() {
        return this.infectionAbility;
    }

    /**
     * Tryin' to change status of OS
     */
    public void virusAttack() {
        Randomizer random = new Randomizer(this.infectionAbility);
        if (random.getResult()) {
            infectionStatus = true;
        }
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
