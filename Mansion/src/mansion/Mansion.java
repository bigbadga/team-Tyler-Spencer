package mansion;

import byui.cit260.mansion.model.Backpack;
import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Player;
import byui.cit260.mansion.model.Character;
import byui.cit260.mansion.model.Clue;
import byui.cit260.mansion.model.Scene;
import byui.cit260.mansion.model.Game;
import byui.cit260.mansion.model.Location;
import byui.cit260.mansion.model.Map;


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
        characterOne.setColumnCoordinate(7);
        characterOne.setRowCoordinate(5);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        

        Item gun = new Item();  

        gun.setItemName("Big gun");
        gun.setDescription("It is a very big gun.");
        gun.setContent("NOT APPLICABLE");
        
        String guninfo = gun.toString();
        System.out.println(guninfo);

           
        Clue file1=new Clue();
        
        file1.setClueName("tony's file");
        file1.setContent("He might be the murderer.");
        
        String clueInfo = file1.toString();
        System.out.println(clueInfo);
       
        
        Backpack big=new Backpack();
        
        big.setItemAmount(1);
        
        String big1=big.toString();
        System.out.println(""+big1);
        
        
        Scene door=new Scene();
        
        door.setDescription("It is a black door");
        
        String dr1=door.toString();
        System.out.println(dr1);

        
        Game murderAtTheMansion = new Game();
        
        murderAtTheMansion.setStartTime(0);
        murderAtTheMansion.setEndTime(35.00);
        
        String gameInfo = murderAtTheMansion.toString();
        System.out.println(gameInfo);
        
        
        Map gameMap = new Map();
        
        gameMap.setNumberOfRows(10);
        gameMap.setNumberOfColumns(10);
        
        String mapInfo = gameMap.toString();
        System.out.println(mapInfo);
        
        
        Location currentLocation = new Location();
        
        currentLocation.setDescription("This is an empty room");
        currentLocation.setRow(5);
        currentLocation.setColumn(7);
        
        String locationInfo = currentLocation.toString();
        System.out.println(locationInfo);
             
    }
          
}
