package byui.cit260.mansion.view;

import byui.cit260.mansion.model.Location;
import byui.cit260.mansion.model.Scene;
import byui.cit260.mansion.model.Map;
import byui.cit260.mansion.model.Scene.SceneType;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author tylerbadger
 */
public class GameMenuView extends View {
    
    private String gameMenu;
    private Location[][] map = Map.getLocations();
    private String outputLocation;
    private Scene SceneType;
    
    public GameMenuView(){
        super("\n"
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
              + "\nW - Find Weapon"
              + "\nF - Find Scene"
              + "\nP - Print File"
              + "\nQ - Quit"
              + "\n------------------------------------------------------------");
    }
 
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
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
                this.displayMap(map);
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
            case "W":
                this.findItem();
                break;
            case "F":
                this.findScene();
                break;
            case "P":
                this.printScenes(SceneType, outputLocation);
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void moveCharacter() {
        MoveView move = new MoveView();
        move.display();
    }

    private void interactWithObject() {
        InteractWithObjectView interact = new InteractWithObjectView();
        interact.display();
    }

    private void displayObjects() {
        System.out.println("\n*** displayObjects() called ***");
    }

    private void obtainObjects() {
        System.out.println("\n*** obtainObjects() called ***");
    }

    private void displayMap(Location[][] map) {
        // get the map locations for the current game
        System.out.println("\n\t*** Mansion Map ***");
        System.out.println("\n   1     2    3    4    5");
        for (int i = 0; i < map.length; i++) {
            System.out.println("  ---- ---- ---- ---- ---- ");
            System.out.print(i + 1 + "|");
            for (int j = 0; j < map.length; j++) {
                Location[][] locations = Map.getLocations();
                if (Location.getVisited() == true){
                    System.out.print(Scene.getMapSymbol());
                } else {
                    System.out.print(" ?? ");
                }
                System.out.print("|");
            }
            System.out.println(" ");
            
        }
        System.out.println("  ---- ---- ---- ---- ---- ");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() called ***");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void backpackMenu() {
        BackpackMenuView backpackMenu = new BackpackMenuView();
        backpackMenu.display();
    }

    private void guessMurderer() {
        GuessMurdererView guessmurderer=new GuessMurdererView();
        guessmurderer.display();
    }

    private void findItem() {
        FindItemView finditem=new FindItemView();
        finditem.display();
    }
    
    private void findScene() {
        FindSceneView findScene = new FindSceneView();
        findScene.display();
    }
    
    public void printScenes(enum SceneType, String outputLocation) {
        
        // create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            
            // print title and column headings
            out.println("\n\n               Scene Report               ");
            out.printf("%n%-20s%10s%10s", "Description", "Map Symbol", "Blocked?");
            out.printf("%n%-20s%10s%10s", "-----------", "----------", "--------");
            
            for(SceneType scene : SceneType) {
                out.printf("%n%-20s%7d%13.2f", scene.getDescription()
                                             , scene.getMapSymbol()
                                             , scene.getBlockedRoom());
            }
            
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        } 
    }
}