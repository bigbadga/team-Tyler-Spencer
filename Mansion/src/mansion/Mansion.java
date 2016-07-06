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
import byui.cit260.mansion.view.StartProgramView;


/**
 *
 * @author tylerbadger
 */
public class Mansion {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        
        try {
        startProgramView.display();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Mansion.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Mansion.player = player;
    }
          
}
