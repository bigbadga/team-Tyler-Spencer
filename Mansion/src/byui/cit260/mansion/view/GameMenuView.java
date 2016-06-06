package byui.cit260.mansion.view;

import java.util.Scanner;

/**
 *
 * @author tylerbadger
 */
public class GameMenuView {
    
    private String gameMenu;
    
    public GameMenuView(){
        this.gameMenu = "\n"
              + "\n------------------------------------------------------------"
              + "\n| Game Menu                                                |"
              + "\n------------------------------------------------------------"
              + "\nC - Move Character"
              + "\nI - Interact with object(s) in current room"
              + "\nD - Display usable objects in location"
              + "\nO - Obtain items"
              + "\nM - Display map"
              + "\nS - Save game"
              + "\nH - Help menu"
              + "\nB - Show backpack"
              + "\nG - Guess the murderer"
              + "\nQ - Quit"
              + "\n------------------------------------------------------------";
    }
 
    /**
     * displays the start program view
     */
    public void displayGameMenuView() {
        
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

    void displayMenu() {
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { // loop while an invalid value is enter
           System.out.println("\n" + this.gameMenu);
           
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
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C":
                this.moveCharacter();
                break;
            case "I":
                this.interactWithObject();
                break;
            case "D":
                this.displayObjects();
                break;
            case "O":
                this.obtainObjects();
                break;
            case "M":
                this.displayMap();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.helpMenu();
                break;
            case "B":
                this.backpackMenu();
                break;
            case "G":
                this.guessMurderer();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void moveCharacter() {
        System.out.println("\n*** moveCharacter() called ***");
    }

    private void interactWithObject() {
        System.out.println("\n*** interactWithObject() called ***");
    }

    private void displayObjects() {
        System.out.println("\n*** displayObjects() called ***");
    }

    private void obtainObjects() {
        System.out.println("\n*** obtainObjects() called ***");
    }

    private void displayMap() {
        System.out.println("\n*** displayMap() called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() called ***");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void backpackMenu() {
        BackpackMenuView backpackMenu = new BackpackMenuView();
        backpackMenu.displayBackpackMenuView();
    }

    private void guessMurderer() {
        System.out.println("\n*** guessMurderer() called ***");
    }

}
