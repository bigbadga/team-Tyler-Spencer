package byui.cit260.mansion.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author che11_000
 */
public class BackpackControlTest {
    
    public BackpackControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcAmountOfRain method, of class BackpackControl.
     */
    @Test
    public void testCalcAmountOfRain() {
        System.out.println("TestCase1");
        double sumLY = 150000;
        double seasonRain = 45000;
        BackpackControl instance = new BackpackControl();
        double expResult = 36000;
        double result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("TestCase2");
        sumLY = -1;
        seasonRain = 45000;
        expResult = -1;
        result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("TestCase3");
        sumLY = 150000;
        seasonRain = -1;
        expResult = -1;
        result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("TestCase4");
        sumLY = 220000;
        seasonRain = 45000;
        expResult = -1;
        result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("TestCase5");
        sumLY = 1000;
        seasonRain = 50000;
        expResult = 6000000;
        result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("TestCase6");
        sumLY = 200000;
        seasonRain = 1;
        expResult = 0.6;
        result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("TestCase7");
        sumLY = 200000;
        seasonRain = 50000;
        expResult = 30000;
        result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcTimeOfDeath method, of class BackpackControl.
     */
    @Test
    public void testCalcTimeOfDeath() {
        System.out.println("calcTimeOfDeath1");
        double earliestTime = 20;
        double latestTime = 23;
        BackpackControl instance = new BackpackControl();
        double expResult = 3;
        double result = instance.calcTimeOfDeath(earliestTime, latestTime);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcTimeOfDeath2");
        earliestTime = -1;
        latestTime = 23;
        expResult = -1;
        result = instance.calcTimeOfDeath(earliestTime, latestTime);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcTimeOfDeath3");
        earliestTime = 20;
        latestTime = -1;
        expResult = -1;
        result = instance.calcTimeOfDeath(earliestTime, latestTime);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcTimeOfDeath4");
        earliestTime = 20;
        latestTime = 25;
        expResult = -1;
        result = instance.calcTimeOfDeath(earliestTime, latestTime);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcTimeOfDeath5");
        earliestTime = 0;
        latestTime = 24;
        expResult = 24;
        result = instance.calcTimeOfDeath(earliestTime, latestTime);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcTimeOfDeath6");
        earliestTime = 18;
        latestTime = 24;
        expResult = 6;
        result = instance.calcTimeOfDeath(earliestTime, latestTime);
        assertEquals(expResult, result, 0.0);
    }
    
}
