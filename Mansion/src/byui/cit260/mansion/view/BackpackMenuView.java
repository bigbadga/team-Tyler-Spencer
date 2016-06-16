package byui.cit260.mansion.view;
/**
 *
 * @author che11_000
 */
public class BackpackMenuView extends View {
    
    private String backpackMenu;
    
    public BackpackMenuView(){
        super("\n"
              + "\n------------------------------------------------------------"
              + "\n|                    Backpack Menu                         |"
              + "\n------------------------------------------------------------"
              + "\nC - Look at the clues"
              + "\nS - Suspect files"
              + "\nV - Victim files"
              + "\nW - Weapons"
              + "\nQ - Quit"
              + "\n------------------------------------------------------------");
                      
    }
    

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch(value) {
            case "C":
                this.clues();
                break;
            case "S":
                this.suspects();
                break;
            case "V":
                this.victims();
                break;
            case "W":
                this.weapons();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void clues() {
      AgefunctionView agefunction= new AgefunctionView();
      agefunction.display();

    }

    private void suspects() {
        System.out.println("\n***suspect 1:.... ***");
    }

    private void victims() {
        TimeOfDeathView timeOfDeath = new TimeOfDeathView();
        timeOfDeath.display();
    }

    private void weapons() {
        System.out.println("\n*** weapon 1:.... ***");
    }
    
}
