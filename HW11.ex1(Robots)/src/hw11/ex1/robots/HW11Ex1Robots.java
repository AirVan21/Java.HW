package hw11.ex1.robots;

/**
 * Robot's actions 
 */
public class HW11Ex1Robots {

    public static void main(String[] args) throws NotExistException{
        Map map = new Map();
        map.setRobot(1);
        map.setRobot(3);
        map.setRobot(5);
        for (int i = 0; i < 30; i++) {
            try {
                map.progress();
            } catch (NotExistException exception) {
                exception.getMessage();
            }
        }
    }
}
