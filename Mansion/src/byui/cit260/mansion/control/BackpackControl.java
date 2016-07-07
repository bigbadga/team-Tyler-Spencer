package byui.cit260.mansion.control;

import byui.cit260.mansion.exceptions.BackpackControlException;

/**
 *
 * @author che11_000
 */
public class BackpackControl {

    public double calcAmountOfRain(double sumLY, double seasonRain) throws BackpackControlException{
//If input is invalid, then return error code and exit.
        if(sumLY <= 0 || sumLY > 200000){
        throw new BackpackControlException("The number is invalid  because sumLY is smaller than 0"
                + "or sumLY is larger than 200000");
        }
        if(seasonRain <= 0 || seasonRain > 50000 ){
        throw new BackpackControlException("The number is invalid because seasonRain is smaller than 0"
                + "or seasonRain is larger than 50000");
        }
        
        double HighestAmountOfRain = 120000 / sumLY * seasonRain;
        return HighestAmountOfRain;
    
    }
    
    public static int calcTimeOfDeath(int earliestTime, int latestTime)throws BackpackControlException {
        
        if(earliestTime < 0 || earliestTime > 24){
            throw new BackpackControlException("The number is invalid  because ealiestTime is smaller than 0"
                + "or earliestTime is larger than 24");
        }
        if(latestTime < 0 || latestTime > 24){
            throw new BackpackControlException("The number is invalid  because latestTime is smaller than 0"
                + "or latestTime is larger than 24");
        }
        
        int hours = latestTime - earliestTime;
        return hours;
    }
    
    public static boolean checkTime(int earliestTime, int latestTime, int guessedTime)throws BackpackControlException{
        
        int calculatedTime = BackpackControl.calcTimeOfDeath(earliestTime, latestTime);
        
        if (calculatedTime == 0){
            
            return false;
            
        } else if (calculatedTime == guessedTime){
            
            return true;
            
        } else {
            
            return false;
        }
    }
    
    public static int calcAge ( int birthdayYear, int yearOfCountry)throws BackpackControlException{
 
    //if input is invalid, then return error code and exit.
 
    if (birthdayYear < 1 || birthdayYear > 100){
        throw new BackpackControlException("The year must be between 1 and 100.");
    }
    if (yearOfCountry < 1900 || yearOfCountry > 2010){
        throw new BackpackControlException("The year must be between 1900 and 2010.");
    }
 
    if (yearOfCountry + birthdayYear > 2016){
        throw new BackpackControlException("The year or birthday year is invalid.");
    }
    int age= 2016 - (birthdayYear + yearOfCountry);
    return age;
    }
    
    public static boolean checkAge(int birthdayYear,int yearOfCountry, long guessedAge)throws BackpackControlException {
        
        int calculatedAge =  BackpackControl.calcAge(birthdayYear, yearOfCountry);
        
        if (calculatedAge < 0) {
            return false;
        }
        
        else if (calculatedAge == guessedAge) {
            return true;
        }
        else {
            return false;
        }
    }
}
