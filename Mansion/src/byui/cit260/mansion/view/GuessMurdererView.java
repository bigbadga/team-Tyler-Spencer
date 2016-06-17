package byui.cit260.mansion.view;

/**
 *
 * @author che11_000
 */
public class GuessMurdererView extends View{
    public GuessMurdererView(){
           super("Seems like you got a clue on the murderer. Give it a try and enter the murderer's name."
                +"\nPlease enter the full name of the murderer below."
           
           );
    }
    @Override
    public boolean doAction(String value) {
        
        
        switch (value) {
            case "John Allen Smith":
                System.out.println("You got it. Well done, detective!");
                
                return true;
                
                default:
                System.out.println("\n*** This person is innocent, don't let the appearance deceive you.");
                break;
        }
        return false;
        
        
    }
    
    }
    

