package hw11.ex1.robots.version2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class RobotsTest {

    /**
     * Test of changeCondition method, of class Robots.
     */
    @Test
    public void testChangeCondition() {
        boolean[][] matrix = {
            {false, true, false, false},
            {true, false, true, true},
            {false, true, false, false},
            {false, true, false, false}
        };
        boolean[] robotPosition1 = {false, true, false, false};
        Robots model = new Robots(matrix, robotPosition1);
        assertEquals(1, model.getRobotAmount());
        
        boolean[] robotPosition2 = {true, true, false, false};
        model.changeCondition(matrix, robotPosition2);
        assertEquals(2, model.getRobotAmount());
    }

    /**
     * Test of getRobotAmount method, of class Robots.
     */
    @Test
    public void testGetRobotAmount() {
        boolean[][] matrix = {
            {false, true, false, false},
            {true, false, true, true},
            {false, true, false, false},
            {false, true, false, false}
        };
        boolean[] robotPosition1 = {false, true, true, true};
        Robots model = new Robots(matrix, robotPosition1);
        assertEquals(3, model.getRobotAmount());
    }

    /**
     * Test of isDone method, one robot
     */
    @Test
    public void testIsDone1() {
        boolean[][] matrix = {
            {false, true, false, true},
            {true, false, true, false},
            {false, true, false, true},
            {true, false, true, false}
        };
        boolean[] robotPosition = {false, true, false, false};
        Robots model = new Robots(matrix, robotPosition);
        assertFalse(model.isDone());
    }
    
    /**
     * Test of isDone method, "False"
     */
    @Test
    public void testIsDone2() {
        boolean[][] matrix = {
            {false, true, false, true},
            {true, false, true, false},
            {false, true, false, true},
            {true, false, true, false}
        };
        boolean[] robotPosition = {true, true, false, false};
        Robots model = new Robots(matrix, robotPosition);
        assertFalse(model.isDone());
    }
    
    /**
     * Test of isDone method, "True"
     */
    @Test
    public void testIsDone3() {
        boolean[][] matrix = {
            {false, true, false, true},
            {true, false, true, false},
            {false, true, false, true},
            {true, false, true, false}
        };
        boolean[] robotPosition = {true, false, true, false};
        Robots model = new Robots(matrix, robotPosition);
        assertTrue(model.isDone());
    }
}
