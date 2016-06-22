package byui.cit260.mansion.control;

import byui.cit260.mansion.model.Game;
import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Map;
import byui.cit260.mansion.model.Player;
import mansion.Mansion;

/**
 *
 * @author tylerbadger
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if(name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Mansion.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        Mansion.setCurrentGame(game); // save in Mansion
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        Item[] backpackList = GameControl.createBackpackList();
        game.setBackpack(backpackList);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); // save map in game
        
        //move character to starting position in the map
        MapControl.moveCharacterToStartingLocation(map);
    }
    
    public static Item[] createBackpackList() {
        System.out.println("*** called createBackpackList() in GameControl ***");
        return null;
    }
    
}
