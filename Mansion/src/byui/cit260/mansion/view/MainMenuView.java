package byui.cit260.mansion.view;

import mansion.Mansion;
import byui.cit260.mansion.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author tylerbadger
 */
public class MainMenuView extends View {
    private String menu;
    
    public MainMenuView(){
    super( "\n"
              + "\n------------------------------------------------------------"
              + "\n| Main Menu                                                |"
              + "\n------------------------------------------------------------"
              + "\nN - Start new game"
              + "\nR - Restart existing game"
              + "\nH - Help"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(Mansion.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame called ***");
    }  
}