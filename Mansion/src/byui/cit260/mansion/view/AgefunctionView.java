/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mansion.view;
import byui.cit260.mansion.control.BackpackControl;
import java.util.Scanner;

/**
 *
 * @author che11_000
 */
public class AgefunctionView {
    
     private String backpackMenu;
    private String agefunctionView;
    public AgefunctionView(){
        this.backpackMenu = "\nThis is one of the IDs you got from suspects.   "
              + "\n"
              + "\n                                                            "
              + "\n------------------------------------------------------------"
              + "\n|                  Person Identification                   |"
              + "\n------------------------------------------------------------"
              + "\n| Name: Bryan Cook     G: Male                             |"
              + "\n| Birthday:73-5-16                                         |"
              + "\n| Country: Nigratho (found in 1905)                        |"
              + "\n------------------------------------------------------------"
              + "\nWhat is this suspect's age?"
              + "\n(calculate the age or press Q to exist.)";
                      
    }
    
    public void displayAgefunctionView() {
        
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
           System.out.println("\n" + this.agefunctionView);
           
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
        // convert choice to long number
        long age=Long.parseLong(choice);
        
        // call calcAge and pass the date and puntry years
        
        
        boolean answer=BackpackControl.checkAge(73, 1905, age );
        // if age returned is negative
        if (answer==true){ 
        System.out.println("\n*** This is right, the age will now be stored in the suspect files.***");
        }
        else {
        System.out.println("\n*** Please try again.***");
        }   
        return doAction(choice);
    }
}
        
    
    
