package mansion;

import byui.cit260.mansion.model.Backpack;
import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Player;
import byui.cit260.mansion.model.Character;
import byui.cit260.mansion.model.Clue;
import byui.cit260.mansion.model.Scene;

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
      gun.setContent("NOT APPLICABLE  ");
      String guninfo = gun.toString();
       System.out.println(guninfo);

        
        
        Clue file1=new Clue();
        file1.setClueName("tony's file");
        file1.setContent("He might be the murderer.");
        String file01=file1.toString();
        System.out.println(file01);
        
        Backpack big=new Backpack();
        big.setItemAomunt(1);
        String big1=big.toString();
        System.out.println(""+big1);
        
        Scene door=new Scene();
        door.setDescription("It is a black door");
        String dr1=door.toString();
        System.out.println(dr1);
        
    }
          
}
