/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansion;

import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Player;

/**
 *
 * @author tylerbadger
 */
public class Mansion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
    
      Item gun=new Item();  
      gun.setItemName("Big gun");
      gun.setDescription("It is a very huge gun.");
      gun.setContent("NOT APPLICABLE  ");
      String guninfo = gun.toString();
        System.out.println(guninfo);
    }
    }

