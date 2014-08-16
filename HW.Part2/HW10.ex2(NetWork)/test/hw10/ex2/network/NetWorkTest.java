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
        assertTrue(localNet.hasSafe());
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
        // first iteration
        // 2 attacks 1
        // 2 attacks 4
        localNet.progress();
        localNet.progress();
        assertTrue(pcAmount[0].isInfected());
        assertTrue(pcAmount[3].isInfected());
        
        assertFalse(pcAmount[4].isInfected());
        assertFalse(pcAmount[2].isInfected());
        
        // second iteration
        // 1 attacks 3
        // 4 attack 5
        localNet.progress();           
        for (int i = 0; i < pcAmount.length; i++) {
            assertTrue(pcAmount[i].isInfected());
        }
    }
    
    private final int linux = 100;
    private final int windows = 100;
    private final int chrome = 100;
}
