package byui.cit260.mansion.view;

/**
 *
 * @author tylerbadger
 */
public class WeaponView extends View {
    
    public WeaponView() {
        super("\n Here is the list of weapons that you are currently carrying:"
            + "\n Knife, Gun"
            + "\n(Enter 'Q' to return to the Backpack Menu)");
    }

    @Override
    public boolean doAction(String value) {
        value=value.toUpperCase();
        switch(value) {
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
}