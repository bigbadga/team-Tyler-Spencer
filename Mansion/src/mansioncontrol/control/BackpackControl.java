/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansioncontrol.control;

/**
 *
 * @author che11_000
 */
public class BackpackControl {
    
    public int calcAge ( int birthdayYear, int yearOfCountry){

    //If input is invalid, then return error code and exit.

        if (birthdayYear <1 ||birthdayYear>100){
        return -1;
        }

        if (yearOfCountry <1900 || yearOfCountry >2010){
        return -1;
        }

        if (yearOfCountry+birthdayYear >2016) {
        return -1;
        }
        int age = 2016 - birthdayYear- yearOfCountry;
        return  age;
    

}
    
    
    
    
    
    
    
    
    
    

    public double calcAmountOfRain(double sumLY, double seasonRain) {

//If input is invalid, then return error code and exit.
        if (sumLY <=0 || sumLY >200000){
        return -1;
        }
        if (seasonRain <=0 || seasonRain >50000 ){
        return -1;
        }
        
        double HighestAmountOfRain = 120000/sumLY * seasonRain;
        return HighestAmountOfRain;
    }
}
