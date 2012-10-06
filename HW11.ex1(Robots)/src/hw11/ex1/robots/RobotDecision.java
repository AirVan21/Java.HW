package hw11.ex1.robots;

import java.util.Random;

/**
 * Сhoose possible transposition for Robot
 */
public class RobotDecision {
    
    /**
     * Constructor
     * @param connections node connections
     * @param stateNode place, where robot is sittin' now
     */
    public RobotDecision(List[] connections, int stateNode) {
        this.field = connections;
        this.place = stateNode;
    }
    
    /**
     * Findin' new place for robot
     * @return 
     */
    public int findNextPlace() {
        Random randomizer = new Random();
        // first transposition
        int amountOfPlaces = this.field[this.place - 1].listAmount();// massiv 0 - 9
        ListElement current = this.field[this.place - 1].getHead();
        int randomChoise = randomizer.nextInt(amountOfPlaces);
        for (int i = 0; i < randomChoise; i++) {
            current = current.getNext();
        }
        // still in this node
        if (this.place == current.getId()) {
            return this.place;
        }
        // found middle random node
        int middleNode = current.getId();
        amountOfPlaces = this.field[middleNode - 1].listAmount();// massiv 0 - 9
        current = this.field[middleNode - 1].getHead();
        randomChoise = randomizer.nextInt(amountOfPlaces);
        for (int i = 0; i < randomChoise; i++) {
            current = current.getNext();
        }
        // found destination
        if (middleNode == current.getId()) {
            return this.place;
        }
        return current.getId();
    }
    
    /**
     * Amount of nodes, where robot could go
     */
    private List possibleStep;
    
    /**
     * Place of robot(node number)
     */
    private int place;
    
    /**
     * Field of positions
     */
    private List[] field;
}
