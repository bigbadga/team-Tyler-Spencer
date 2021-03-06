package byui.cit260.mansion.control;

import byui.cit260.mansion.exceptions.GameControlException;
import byui.cit260.mansion.model.Game;
import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Map;
import byui.cit260.mansion.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        // created array of backpack items
        Item[] backpack = new Item[3];
        
        Item gun = new Item();
        gun.setItemName("Gun");
        gun.setDescription("It is a large gun, possibly used for murder");
        gun.setItemAmount(0);
        gun.setContent("");
        backpack[0] = gun;
        
        Item hammer = new Item();
        hammer.setItemName("Hammer");
        hammer.setDescription("This hammer looks suspicious...");
        hammer.setItemAmount(0);
        hammer.setContent("");
        backpack[1] = hammer;
        
        Item clue = new Item();
        clue.setItemName("Clue");
        clue.setDescription("");
        clue.setItemAmount(0);
        clue.setContent("");
        backpack[2] = clue;
        
        return backpack;
    }
    
    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filepath)
            throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        Mansion.setCurrentGame(game); // save in Mansion
    }
}
