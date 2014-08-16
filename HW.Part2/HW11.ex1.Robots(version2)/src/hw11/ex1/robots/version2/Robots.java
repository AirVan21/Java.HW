package hw11.ex1.robots.version2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Robots desicions
 */
public class Robots {
    
    /**
     * Constructor
     * @param currentMatrix adjacency matrix 
     * @param currentRobotPositions places, where robots situated
     */
    public Robots(boolean[][] currentMatrix, boolean[] currentRobotPositions) {
        changeCondition(currentMatrix, currentRobotPositions);
    }
    
    /**
     * Sets new condition
     * @param currentMatrix new connection Matrix
     * @param currentRobotPositions new places for Robots
     */
    public final void changeCondition(boolean[][] currentMatrix, boolean[] currentRobotPositions) {
        this.robotPositions = currentRobotPositions;
        this.connectionMatrix = currentMatrix;
    }
    
    /**
     * Counts amount of robots
     * @return 
     */
    public int getRobotAmount() {
        int amount = 0;
        for (int i = 0; i < this.robotPositions.length; i++) {
            if (this.robotPositions[i]) {
                amount++;
            }
        }
        return amount;
    }
    
    public boolean isDone() {
        Queue<Integer> queueForDetour = new LinkedList<>();
        int allAmount = this.getRobotAmount();
        int componentAmount = 0;
        boolean[] attendedNodes = new boolean[robotPositions.length];
        
        // start with a first node
        attendedNodes[0] = true;
        queueForDetour.add(0);
        // one robot couldn't be destroyed
        if (allAmount == 1) {
            return false;
        }
        if (this.robotPositions[0]) {
            componentAmount++;
        }
        
        while (!queueForDetour.isEmpty()) {
            int currentNode = queueForDetour.remove();
            for (int i = 0; i < this.connectionMatrix.length; i++) {
                if (this.connectionMatrix[currentNode][i]) {
                    for (int j = 0; j < this.connectionMatrix.length; j++) {
                        if (this.connectionMatrix[i][j]) {
                            if (!attendedNodes[j]) {
                                attendedNodes[j] = true;
                                queueForDetour.add(j);

                                if (this.robotPositions[j]) {
                                    componentAmount++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (componentAmount == 1) {
            return false;
        }
        if (allAmount - componentAmount == 1) {
            return false;
        }
        return true;
    }
    
    
    /**
     * Adjacence matrix
     */
    private boolean[][] connectionMatrix;
    
    /**
     * True, when robot exist in this node
     */
    private boolean[] robotPositions;
}
