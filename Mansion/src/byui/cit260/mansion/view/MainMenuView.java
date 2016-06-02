package byui.cit260.mansion.view;

import mansion.Mansion;
import byui.cit260.mansion.control.GameControl;

/**
 *
 * @author tylerbadger
 */
public class MainMenuView {
    private String menu;
    
    public MainMenuView(){
    this.menu = "\n"
              + "\n------------------------------------------------------------"
              + "\n| Main Menu                                                |"
              + "\n------------------------------------------------------------"
              + "\nN - Start new game"
              + "\nR - Restart existing game"
              + "\nH - Help"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n------------------------------------------------------------";
    }
    /**
     * displays the start program view
     */
    public void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
            // do thte requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
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
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame called");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu called");
    }

    private void saveGame() {
        System.out.println("\nsaveGame called");
    }
    
}
