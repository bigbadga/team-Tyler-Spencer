package byui.cit260.mansion.view;

/**
 *
 * @author tylerbadger
 */
public class GameMenuView extends View {
    
    private String gameMenu;
    
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

    private void displayMap() {
        System.out.println("\n*** displayMap() called ***");
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

}
