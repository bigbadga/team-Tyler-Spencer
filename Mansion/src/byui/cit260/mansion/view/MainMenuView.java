package byui.cit260.mansion.view;

/**
 *
 * @author tylerbadger
 */
public class MainMenuView {
    private String menu;
    public MainMenuView(){
    this.menu = "\n"
              + "\n------------------------------------------------------------"
              + "\n| Main Menu                                                |"
              + "\n------------------------------------------------------------"
              + "\nN - Start new game"
              + "\nR - Restart existing game"
              + "\nH - Help"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n------------------------------------------------------------";
    }
public void displayMainMenuView() {
        
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        System.out.println("\n*** startNewGame() function called ***");
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame called");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu called");
    }

    private void saveGame() {
        System.out.println("\nsaveGame called");
    }
    
}
