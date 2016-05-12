package mansion;

import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Player;
import byui.cit260.mansion.model.Character;

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
        
        Character characterOne = new Character();
        
        characterOne.setName("Jake");
        characterOne.setDescription("Main Character");
        characterOne.setCoordinates(12);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        Item gun=new Item();  
      gun.setItemName("Big gun");
      gun.setDescription("It is a very huge gun.");
      gun.setContent("  ");
      String guninfo = gun.toString();
        System.out.println(guninfo);
    }
          
}
