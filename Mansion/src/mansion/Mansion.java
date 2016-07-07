package mansion;

import byui.cit260.mansion.model.Backpack;
import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Player;
import byui.cit260.mansion.model.Character;
import byui.cit260.mansion.model.Clue;
import byui.cit260.mansion.model.Scene;
import byui.cit260.mansion.model.Game;
import byui.cit260.mansion.model.Location;
import byui.cit260.mansion.model.Map;
import byui.cit260.mansion.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author tylerbadger
 */
public class Mansion {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        try {
            
            // open character stream fiiles for end user input and output
            Mansion.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            Mansion.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            Mansion.logFile = new PrintWriter(filePath);
        
        
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
        } catch (Throwable e) {
            
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();
        }
        
        finally {
            try {
                if (Mansion.inFile != null)
                    Mansion.inFile.close();
                
                if (Mansion.outFile != null)
                    Mansion.outFile.close();
                
                if (Mansion.logFile != null)
                    Mansion.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Mansion.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Mansion.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Mansion.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Mansion.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Mansion.logFile = logFile;
    }
    
}