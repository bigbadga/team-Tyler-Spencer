package byui.cit260.mansion.control;

/**
 *
 * @author che11_000
 */
public class BackpackControl {

    public double calcAmountOfRain(double sumLY, double seasonRain) {

//If input is invalid, then return error code and exit.
        if(sumLY <= 0 || sumLY > 200000){
        return -1;
        }
        if(seasonRain <= 0 || seasonRain > 50000 ){
        return -1;
        }
        
        double HighestAmountOfRain = 120000 / sumLY * seasonRain;
        return HighestAmountOfRain;
    }
    
    public double calcTimeOfDeath(double earliestTime, double latestTime) {
        
        if(earliestTime < 0 || earliestTime > 24){
            return -1;
        }
        if(latestTime < 0 || latestTime > 24){
            return -1;
        }
        
        double hours = latestTime - earliestTime;
        return hours;
    }
}
