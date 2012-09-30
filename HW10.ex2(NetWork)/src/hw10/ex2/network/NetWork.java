package hw10.ex2.network;

/**
 * Generates local Network behaviour
 */
public class NetWork {
    
    public NetWork(){
        this.computers = new PC[this.connection.length];
        this.computers[0] = new PC(new Windows(false));
        this.computers[1] = new PC(new Windows(true));
        this.computers[2] = new PC(new Linux(false));
        this.computers[3] = new PC(new Linux(false));
        this.computers[4] = new PC(new Chrome(false));
    }
    
    /**
     * Makes system cooperation step
     */
    public void progress() {
        for (int i = 0; i < this.computers.length; i++) {
            for (int j = 0; j < this.computers.length; j++) {
                // check connection and infection for virus attack possibility
                if ((this.connection[i][j] == 1) && (this.computers[i].isInfected() || this.computers[j].isInfected())) {
                    if (this.computers[i].isInfected()) {
                        this.computers[j].attack();
                    } else {
                        this.computers[i].attack();
                    }
                }
            }
        }       
    }
    
    /**
     * Find safe computers
     * @return 
     */
    public boolean hasSafe() {
        boolean answer = false;
        for (int i = 0; i < this.computers.length; i++) {
            if (!this.computers[i].isInfected()) {
                return true;
            }
        }
        return answer;
    }
    
    /**
     * Output system status
     */
    public void showNet() {
        for (int i = 0; i < this.connection.length; i++) {
            if (this.computers[i].isInfected()) {
                System.out.println("PC № " + (++i) + " - is Infected");
                i--;
            } else {
                System.out.println("PC № " + (++i) + " - is Safe");
                i--;
            }
            
        }
        System.out.println();
    }
    
    /**
     * Method for computer connection test
     * @return 
     */
    protected PC[] getComputers() {
        return this.computers;
    }
    
    /**
     * Current PCs
     */
    private PC[] computers;
    
    /**
     * Describes PC connections
     */
    private final int[][] connection = {
        {0, 1, 1 , 0, 1},
        {1, 0, 0 , 1, 0},
        {1, 0, 0 , 1, 0},
        {0, 1, 1 , 0, 1},
        {1, 0, 0 , 1, 0},
    };
}
