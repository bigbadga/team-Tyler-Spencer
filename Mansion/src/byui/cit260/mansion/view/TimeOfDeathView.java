package byui.cit260.mansion.view;

import java.util.Scanner;
import byui.cit260.mansion.control.BackpackControl;

/**
 *
 * @author tylerbadger
 */
public class TimeOfDeathView {
    
    private String timeOfDeath;
    private double value;
    
    public TimeOfDeathView(){
        this.timeOfDeath = "\n"
              + "\n------------------------------------------------------------"
              + "\n|          What is the victim's time of death?             |"
              + "\n------------------------------------------------------------"
              + "\nYou found a dining receipt from the victim the night that"
              + "\nhe died. The waitress who was working that night said that "
              + "\nhe left the restaurant at about 8:00 PM. The victim was"
              + "\nfound dead at 2 in the morning, and had been dead for at"
              + "\nleast 2 hours. What is the latest possible time of death, "
              + "\nand how many hours did the murderer have to kill the victim?"
              + "\nFirst, what was the earliest time, and the latest time?"
              + "\n(Answer in military time)"
              + "\n------------------------------------------------------------";
    }
    public void displayTimeOfDeathView(){
        boolean done = false; // set flag to not done
        do {
            // prompt for and get the times
            double EarliestTime = this.getEarliestTime();
            double LatestTime = this.getLatestTime();
            
            // do the requested action and display the next view
//            done = this.doAction(EarliestTime, LatestTime);
            
        } while (!done);
    }

    private double getEarliestTime() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
      // double value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { // loop while an invalid value is enter
          System.out.println("\n" + this.timeOfDeath);
           
          value = keyboard.nextDouble(); // get next Line typed on keyboard
           //value = value.trim(); // trim off leading and trailing blanks
           
           if(String.valueOf(value).length() < 1) { // value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           
           break; // end the loop
    }
       return  value;
    }
    
    private double getLatestTime() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
      // double value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { // loop while an invalid value is enter
          System.out.println("\n" + this.timeOfDeath);
           
          value = keyboard.nextDouble(); // get next Line typed on keyboard
           //value = value.trim(); // trim off leading and trailing blanks
           
           if(String.valueOf(value).length() < 1) { // value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           
           break; // end the loop
    }
       return  value;
    }

//    private double doAction(double EarliestTime, double LatestTime) {
//        calcTimeOfDeath(EarliestTime, LatestTime);
//        if(value == -1){
//            
//        }
//        return value;
//    }
}
