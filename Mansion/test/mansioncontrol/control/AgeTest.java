/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansioncontrol.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author che11_000
 */
public class AgeTest {
    
    public AgeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcAge method, of class BackpackControl.
     */
    @Test
    public void testCalcAge() {
        System.out.println("calcAge");
        int birthdayYear = 0;
        int yearOfCountry = 0;
        BackpackControl instance = new BackpackControl();
        int expResult = 0;
        int result = instance.calcAge(birthdayYear, yearOfCountry);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcAmountOfRain method, of class BackpackControl.
     */
    @Test
    public void testCalcAmountOfRain() {
        System.out.println("calcAmountOfRain");
        double sumLY = 0.0;
        double seasonRain = 0.0;
        BackpackControl instance = new BackpackControl();
        double expResult = 0.0;
        double result = instance.calcAmountOfRain(sumLY, seasonRain);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
