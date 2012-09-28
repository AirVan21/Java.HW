package hw10.ex2.network;

/**
 * Users PC model
 */
public class PC {
    
    /**
     * Constrictor
     */
    public PC(OS system) {
        this.system = system;
    }
    
    /**
     * Answers about virus existence
     *
     * @return
     */
    public boolean isInfected() {
        return this.system.isInfected();
    }
    
    /**
     * Commit virus attack
     */
    public void attack() {
        this.system.virusAttack();
    }
    
    /**
     * Name of OS
     */
    private OS system;
}
