package byui.cit260.mansion.view;

import java.util.Scanner;
import byui.cit260.mansion.control.BackpackControl;

/**
 *
 * @author tylerbadger
 */
public class TimeOfDeathView {
    
    private String timeOfDeath;
    private String value;
    
    public TimeOfDeathView(){
        this.timeOfDeath = "\n"
              + "\n------------------------------------------------------------"
              + "\n|          What is the victim's time of death?             |"
              + "\n------------------------------------------------------------"
              + "\nYou found a dining receipt from the victim the night that"
              + "\nhe died. The waitress who was working that night said that "
              + "\nhe left the restaurant at about 8:00 PM. The victim was"
              + "\nfound dead at 2 in the morning, and had been dead for at"
              + "\nleast 2 hours. How many hours did the murderer have to kill "
              + "\nthe victim?"
              + "\n------------------------------------------------------------";
    }

    public void displayTimeOfDeathView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get input from the player
            String option = this.getOption();
            if (option.toUpperCase().equals("Q")) // user wants to exit to the Menu
                return; //exit to the Main Menu
            
            // do the requested action and display the next view
            done = this.doAction(option);
            
        } while (!done);
        
    }

    private String getOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { // loop while an invalid value is enter
           System.out.println("\n" + this.timeOfDeath);
           
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
        //convert choice to integer
        
        int time = Integer.parseInt(choice);
        
        // call calcTimeOfDeath and pass the possible times of death
        
        boolean answer=BackpackControl.checkTime(20, 24, time);
        // if age returned is negative
        if (answer==true){ 
        System.out.println("\n*** This is right, the time of death will now be stored in the victim files.***");
        
        }
        else {
        System.out.println("\n*** Please try again.***");
        displayTimeOfDeathView();
        }   
                
        return true;
        
    }
   
}
