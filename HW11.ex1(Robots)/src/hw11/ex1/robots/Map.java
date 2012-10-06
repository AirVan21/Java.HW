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
        RobotDecision robo = new RobotDecision(this.scene, 1);
        robo.findNextPlace();
        
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
     * Checks is node empty
     * @param checkId num of cheking node
     */
    public boolean isEmpty(int checkId) {
        ListElement currentRobot = this.robotPlace.getHead();
        while (currentRobot != null) {
            if (currentRobot.getId() == checkId) {
                return false;
            }
            currentRobot = currentRobot.getNext();
        }
        return true;
    }
    
    /**
     * On step of Robo-game system
     */
    public void progress() {
        ListElement currentRobot = this.robotPlace.getHead();
        int amount = this.robotPlace.listAmount();
        for (int i = 1; i <= amount; i++) {
            int startPlace = currentRobot.getId();
            RobotDecision event = new RobotDecision(this.scene, currentRobot.getId());
            int nextPlace = event.findNextPlace();
            if (currentRobot.getId() != nextPlace) {
                if (this.isEmpty(nextPlace)) {
                    this.robotPlace.delete(currentRobot.getId());
                    this.robotPlace.add(true, nextPlace);
                    System.out.println("Robot[" + i + "] trnsfered from " + startPlace + " to " + nextPlace);
                } else {
                    this.robotPlace.delete(currentRobot.getId());
                    this.robotPlace.delete(nextPlace);
                    // заплатка, что делать, когда удалилм всех или откуда продожать
                    System.out.println("Robot die hard meeting at - " + nextPlace );
                }
            } else {
                System.out.println("Robot[" + i + "] still stay in - " + startPlace);
            }
            currentRobot = currentRobot.getNext();
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
            } else {
                if (this.connection[nodeId - 1][i] == 1) {
                    list.add(false, upI);
                }
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
