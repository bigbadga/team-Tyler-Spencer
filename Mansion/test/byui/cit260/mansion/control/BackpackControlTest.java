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
        int earliestTime = 20;
        int latestTime = 23;
        BackpackControl instance = new BackpackControl();
        int expResult = 3;
        int result = instance.calcTimeOfDeath(earliestTime, latestTime);
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

    /**
     * Test of calcAge method, of class BackpackControl.
     */
    @Test
    public void testCalcAge() {
        System.out.println("agetestcase1");
        int birthdayYear = 81;
        int yearOfCountry = 1911;
        BackpackControl instance = new BackpackControl();
        int expResult = 24;
        int result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
        
        System.out.println("agetestcase2");
        birthdayYear = 0;
        yearOfCountry = 1911;
        expResult = -1;
        result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
       
        System.out.println("agetestcase3");
        birthdayYear = 81;
        yearOfCountry = 0;
        expResult = -1;
        result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
       
       
        System.out.println("agetestcase4");
        birthdayYear = 1100;
        yearOfCountry = 1911;
        expResult = -1;
        result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
       
       
        System.out.println("agetestcase5");
        birthdayYear = 1;
        yearOfCountry = 2010;
        expResult = 5;
        result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
       
       
       
          System.out.println("agetestcase6");
        birthdayYear = 100;
        yearOfCountry = 1900;
        expResult = 16;
        result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
       
       
        System.out.println("agetestcase7");
        birthdayYear = 1;
        yearOfCountry = 1900;
        expResult = 115;
        result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
       
       
        System.out.println("agetestcase8");
        birthdayYear = 100;
        yearOfCountry = 2010;
        expResult = -1;
        result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
    }
    
}
