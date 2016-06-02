package byui.cit260.mansion.control;

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
        System.out.println("\n*** createNewGame stub function called ***");
    }
    
}
