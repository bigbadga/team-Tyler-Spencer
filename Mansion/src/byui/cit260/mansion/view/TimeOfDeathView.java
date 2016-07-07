package byui.cit260.mansion.view;

import java.util.Scanner;
import byui.cit260.mansion.control.BackpackControl;
import byui.cit260.mansion.exceptions.BackpackControlException;

/**
 *
 * @author tylerbadger
 */
public class TimeOfDeathView extends View{
    
    private String timeOfDeath;
    private String value;
    
    public TimeOfDeathView(){
        super ("\n"
              + "\n------------------------------------------------------------"
              + "\n|          What is the victim's time of death?             |"
              + "\n------------------------------------------------------------"
              + "\nYou found a dining receipt from the victim the night that"
              + "\nhe died. The waitress who was working that night said that "
              + "\nhe left the restaurant at about 8:00 PM. The victim was"
              + "\nfound dead at 2 in the morning, and had been dead for at"
              + "\nleast 2 hours. How many hours did the murderer have to kill "
              + "\nthe victim?"
              + "\n------------------------------------------------------------");
    }

    

    public boolean doAction(String value) {
        //convert choice to integer
        try {
            int time = Integer.parseInt(value);
            try{
        boolean answer=BackpackControl.checkTime(20, 24, time);
         } catch(BackpackControlException msg){
        System.out.println(msg.getMessage());
        
        }finally{
        System.out.close();
        }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
        
        
        // call calcTimeOfDeath and pass the possible times of death
        
        // if age returned is negative
        //if (answer==true){ 
        //System.out.println("\n*** This is right, the time of death will now be stored in the victim files.***");
        
       // }
       // else {
        //System.out.println("\n*** Please try again.***");
        //display();
        //}   
                
        return true;
        
    }
   
}
