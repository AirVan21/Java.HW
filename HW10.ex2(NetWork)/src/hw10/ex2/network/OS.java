package hw10.ex2.network;

/**
 * Describes methods in operation system
 */
public interface OS {

    /**
     * Answers about virus existence
     *
     * @return
     */
    public boolean isInfected();

    /**
     * Gives virus infection opportunity
     *
     * @return
     */
    public int infectionAbility();

    /**
     * Tryin' to change status of OS
     */
    public void virusAttack();
    
}
