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

    public void displayStartProgramView() {
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
            
        } while(!done);
    }

    private String getPlayersName() {
       Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       
       while (!valid) {
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if(value.length() < 1) {
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           
           break;
       }
       
       return value;
    }

    private boolean doAction(String playersName) {
        if(playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n==============================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n==============================================="
                         );
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.displayMainMenuView();
    }
    
}
