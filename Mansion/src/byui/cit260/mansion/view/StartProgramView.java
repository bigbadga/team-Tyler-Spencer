package byui.cit260.mansion.view;

import byui.cit260.mansion.control.GameControl;
import byui.cit260.mansion.model.Player;
import java.util.Scanner;

/**
 *
 * @author tylerbadger
 */
public class StartProgramView {
    
    public String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
                "\n************************************************************"
              + "\n*                                                          *"
              + "\n* You were invited to a party at your Great Uncle's        *"
              + "\n* mansion, in the middle of the woods. When you arrive,    *"
              + "\n* you discover that he was found dead only two hours       *"
              + "\n* earlier.                                                 *"
              + "\n*                                                          *"
              + "\n* Luckily, everyone inside the mansion was prevented from  *"
              + "\n* leaving, so the murderer could be any one of the party   *"
              + "\n* guests. Your job is now to explore the mansion, talk     *"
              + "\n* with the guests, and pick up clues to discover who the   *"
              + "\n* murderer is.                                             *"
              + "\n*                                                          *"
              + "\n* Good luck on your quest.                                 *"
              + "\n*                                                          *"
              + "\n************************************************************"
              );
    }
    /**
     * displays the start program view
     */
    public void displayStartProgramView() {
        
        boolean done = false; // set flag to none
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while(!done);
    }

    private String getPlayersName() {
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { // loop while an invalid value is enter
           System.out.println("\n" + this.promptMessage);
           
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

    private boolean doAction(String playersName) {
        if(playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n==============================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n==============================================="
                         );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}
