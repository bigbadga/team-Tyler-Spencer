package byui.cit260.mansion.view;

/**
 *
 * @author tylerbadger
 */
public class HelpMenuView extends View{
    private String helpMenu;
    
    public HelpMenuView(){
       super( "\n"
              + "\n------------------------------------------------------------"
              + "\n| Help Menu                                                |"
              + "\n------------------------------------------------------------"
              + "\nG - What is the goal of the game?"
              + "\nM - How to move"
              + "\nB - How to get to the backpack"
              + "\nH - Hint"
              + "\nQ - Back to previous Menu"
              + "\n------------------------------------------------------------");
                      
    }
    
    

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch(value) {
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "B":
                this.howToUseBackpack();
                break;
            case "H":
                this.displayHint();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void goalOfGame() {
      System.out.println("\n*** The goal of the game is... ***");

    }

    private void howToMove() {
        System.out.println("\n*** How to move: ***");
    }

    private void howToUseBackpack() {
        System.out.println("\n*** How to use the backpack: ***");
    }

    private void displayHint() {
        System.out.println("\n*** Here is a hint: ***");
    }
}
