package byui.cit260.mansion.view;

import mansion.Mansion;
import byui.cit260.mansion.control.GameControl;
import java.util.Scanner;

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
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { // loop while an invalid value is enter
           System.out.println("\n" + this.menu);
           
           value = keyboard.nextLine(); // get next Line typed on keyboard
           value = value.trim(); // trim off leading and trailing blanks
           
           if(value.length() < 1) { // value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           
           break; // end the loop
       }
       
       return value; //return the value entered
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
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