package byui.cit260.mansion.view;

import java.io.PrintWriter;
import mansion.Mansion;

/**
 *
 * @author tylerbadger
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Mansion.getOutFile();
    private static final PrintWriter logFile = Mansion.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "--------------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n--------------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
