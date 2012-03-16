/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3.ex3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author AirVan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({hw3.ex3.ListTest.class, hw3.ex3.HashTest.class, hw3.ex3.ListElementTest.class})
public class Ex3Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
