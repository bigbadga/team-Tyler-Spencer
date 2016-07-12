package byui.cit260.mansion.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import mansion.Mansion;

/**
 *
 * @author tylerbadger
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = Mansion.getInFile();
    protected final PrintWriter console = Mansion.getOutFile();
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        String value;
        boolean done = false; // set flag to not done
        
        do {
            this.console.println(this.displayMessage); // display the prompt message
            value = this.getInput(); // get the user's selection
            //done = this.doAction(value); // do action based on selection
            
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
        
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        try {
            // while a valid name has not been retrieved
            while (!valid) {
                
                // get the value entered from the keyboard
                selection = keyboard.readLine();
                selection = selection.trim();
                
                if(selection.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                                      "You must enter a value.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                              "Error reading input: " + e.getMessage());
        }
        
        return selection;
       
    }
}
