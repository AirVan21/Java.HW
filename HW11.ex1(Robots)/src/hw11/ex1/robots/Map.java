package hw11.ex1.robots;

/**
 * Map for Robots
 */
public class Map {
    
    /**
     * Constructor
     */
    public Map() {
        this.scene = new List[this.connection.length];
        this.robotPlace = new List();
        this.setGlobalConnection();
    }
    
    /**
     * Add robots on a map
     * @param place place where we put robot
     */
    public void setRobot(int place) {
        robotPlace.add(true, place);
        this.setGlobalConnection();
    }
    
    /**
     * On step of Robo-game system
     */
    public void progress() {
        ListElement current = this.robotPlace.getHead();
        while (current != null) {
                      
        }
    }
    
    /**
     * Adds nodes, which connected with current, into list
     * @param nodeId id of Node for which we write connection 
     * @return connection list
     */
    private List setCurrentConnection(int nodeId) {
        List list = new List();
        for (int i = 0; i < this.connection.length; i++) {
            int upI = i + 1;
            if (robotPlace.existConnection(upI) && this.connection[nodeId - 1][i] == 1) {
                list.add(true, upI);
            }
            if (this.connection[nodeId - 1][i] == 1) {
                list.add(false, upI);
            }
        }
        return list;
    }
    
    /**
     * Make connection table
     */
    private void setGlobalConnection() {
        for (int i = 0; i < this.connection.length; i++) {
            int upI = i + 1;
            this.scene[i] = this.setCurrentConnection(upI);
        }
    }
    
    /**
     * Graf for robot map
     */
    private List[] scene;
    
    /**
     * Where robots are sitting
     */
    private List robotPlace;
    
    /**
     * Describes connections
     */
    private final int[][] connection = {
        {1, 1, 0, 1, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 0, 1, 1, 1, 0, 0},
        {0, 1, 1, 0, 1, 0, 1, 1, 0, 0},
        {1, 1, 0, 1, 1, 0, 0, 0, 0, 0},
        {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 1, 0, 0, 1, 1},
        {0, 1, 1, 0, 0, 0, 1, 1, 0, 0},
        {0, 1, 1, 0, 0, 0, 1, 1, 1, 0},
        {0, 0, 0, 0, 0, 1, 0, 1, 1, 1},
        {1, 0, 0, 0, 0, 1, 0, 0, 1, 1}
    };
}
