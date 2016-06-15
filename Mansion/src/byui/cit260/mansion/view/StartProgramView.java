package byui.cit260.mansion.view;

import byui.cit260.mansion.control.GameControl;
import byui.cit260.mansion.model.Player;

/**
 *
 * @author tylerbadger
 */
public class StartProgramView extends View {
    
    public String promptMessage;
    
    public StartProgramView() {
        super("\nPlease enter your name: ");
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
    
    @Override
    public boolean doAction(String value) {
        if(value.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(value);
        
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
        mainMenuView.display();
    }
    
}
