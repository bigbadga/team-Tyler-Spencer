package byui.cit260.mansion.view;

import mansion.Mansion;
import byui.cit260.mansion.control.GameControl;

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
              + "\nR - Start existing game"
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
        gameMenu.display();
    }

    private void startExistingGame() {
        
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(Mansion.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }  
}