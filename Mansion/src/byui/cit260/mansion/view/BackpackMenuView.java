package byui.cit260.mansion.view;
import java.util.Scanner;
/**
 *
 * @author che11_000
 */
public class BackpackMenuView {
    
    private String backpackMenu;
    
    public BackpackMenuView(){
        this.backpackMenu = "\n"
              + "\n------------------------------------------------------------"
              + "\n|                    Backpack Menu                         |"
              + "\n------------------------------------------------------------"
              + "\nC - Look at the clues"
              + "\nS - Suspect files"
              + "\nV - Victim files"
              + "\nW - Weapons"
              + "\nQ - Quit"
              + "\n------------------------------------------------------------";
                      
    }
    
    public void displayBackpackMenuView() {
        
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
           System.out.println("\n" + this.backpackMenu);
           
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
            case "C":
                this.clues();
                break;
            case "S":
                this.suspects();
                break;
            case "V":
                this.victims();
                break;
            case "W":
                this.weapons();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void clues() {
      System.out.println("\n***clue 1:.... ***");

    }

    private void suspects() {
        System.out.println("\n***suspect 1:.... ***");
    }

    private void victims() {
        System.out.println("\n*** victim 1:... ***");
    }

    private void weapons() {
        System.out.println("\n*** weapon 1:.... ***");
    }
    
}
