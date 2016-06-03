package byui.cit260.mansion.view;

import java.util.Scanner;

/**
 *
 * @author tylerbadger
 */
public class HelpMenuView {
    private String helpMenu;
    
    public HelpMenuView(){
        this.helpMenu = "\n"
              + "\n------------------------------------------------------------"
              + "\n| Help Menu                                                |"
              + "\n------------------------------------------------------------"
              + "\nG - What is the goal of the game?"
              + "\nM - How to move"
              + "\nB - How to get to the backpack"
              + "\nH - Hint"
              + "\nQ - Back to Main Menu"
              + "\n------------------------------------------------------------";
                      
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to exit to the Menu
                return; //exit to the Main Menu
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { // loop while an invalid value is enter
           System.out.println("\n" + this.helpMenu);
           
           value = keyboard.nextLine(); // get next Line typed on keyboard
           value = value.trim(); // trim off leading and trailing blanks
           
           if(value.length() < 1) { // value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           
           break; // end the loop
    }
       return value;
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice) {
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "B":
                this.howToUseBackpack();
                break;
            case "H":
                this.displayHint();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void goalOfGame() {
      System.out.println("\n*** The goal of the game is... ***");

    }

    private void howToMove() {
        System.out.println("\n*** How to move: ***");
    }

    private void howToUseBackpack() {
        System.out.println("\n*** How to use the backpack: ***");
    }

    private void displayHint() {
        System.out.println("\n*** Here is a hint: ***");
    }
}
