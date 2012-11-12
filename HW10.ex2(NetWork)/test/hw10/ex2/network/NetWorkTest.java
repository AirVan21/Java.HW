package hw10.ex2.network;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author AirVan
 */
public class NetWorkTest {
    
    public NetWorkTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//        {0, 1, 1 , 0, 1}
//        {1, 0, 0 , 1, 0}
//        {1, 0, 0 , 1, 0}
//        {0, 1, 1 , 0, 1}
//        {1, 0, 0 , 1, 0}
//        current net connections  
//        second PC is infected
    
    /**
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testProgressGlobal() {
        NetWork localNet = new NetWork(windows, linux, chrome);
        assertTrue(localNet.hasSafe());
        localNet.progress();
        assertFalse(localNet.hasSafe());
    }
    
    /**
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testProgressLocal() {
        NetWork localNet = new NetWork(windows, linux, chrome);
        PC[] pcAmount = localNet.getComputers();
        // We're cheking start values
        assertTrue(pcAmount[1].isInfected());
        for (int i = 0; i < pcAmount.length; i++) {
            if (i != 1) {
                assertFalse(pcAmount[i].isInfected());
            }
        }
        // 2 attacks 1
        pcAmount[0].attack();
        assertTrue(pcAmount[0].isInfected());
        // 1 attacks 3
        pcAmount[2].attack();
        assertTrue(pcAmount[2].isInfected());
        // 1 attacks 5
        pcAmount[4].attack();
        assertTrue(pcAmount[4].isInfected());
        // 2 attacks 1 , which is already infected
        pcAmount[0].attack();
        assertTrue(pcAmount[0].isInfected());
        // 2 attacks 4
        pcAmount[3].attack();
        assertTrue(pcAmount[3].isInfected());
        // All PC infected
        assertFalse(localNet.hasSafe());
    }

    /**
     * Test of hasSafe method, of class NetWork.
     */
    @Test
    public void testHasSafe() {
        NetWork localNet = new NetWork(windows, linux, chrome);
        assertTrue(localNet.hasSafe());
        PC[] pcAmount = localNet.getComputers();
        for (int i = 1; i < pcAmount.length; i++) {
            pcAmount[i].attack();
        }
        assertTrue(localNet.hasSafe());
        pcAmount[0].attack();
        assertFalse(localNet.hasSafe());
    }
    
    private final int linux = 100;
    private final int windows = 100;
    private final int chrome = 100;
}
