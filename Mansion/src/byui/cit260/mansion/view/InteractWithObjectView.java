package byui.cit260.mansion.view;

/**
 *
 * @author tylerbadger
 */
public class InteractWithObjectView extends View {
    
    public InteractWithObjectView(){
        super("\n"
              + "\n------------------------------------------------------------"
              + "\n| Which object would you like to interact with?            |"
              + "\n------------------------------------------------------------"
              + "\nH - Hammer"
              + "\nG - Gun"
              + "\nR - Rope"
              + "\nQ - Return to Game Menu"
              + "\n------------------------------------------------------------");
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch(value) {
            case "H":
                this.useHammer();
                break;
            
            case "G":
                this.useGun();
                break;
              
            case "R":
                this.useRope();
                break;
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void useHammer() {
        System.out.println("\n*** You have used the hammer ***");
    }

    private void useGun() {
        System.out.println("\n*** You have used the gun ***");
    }

    private void useRope() {
        System.out.println("\n*** You have used the rope ***");
    }
}
