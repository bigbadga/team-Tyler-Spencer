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
