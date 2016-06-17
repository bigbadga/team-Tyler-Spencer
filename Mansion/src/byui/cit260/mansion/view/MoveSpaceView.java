package byui.cit260.mansion.view;

/**
 *
 * @author che11_000
 */
public class MoveSpaceView extends View{
    public MoveSpaceView(){
           super("How many spaces do you want to mve "
                +"\nPlease enter a number between 1 to 10. "
           );
       }

    @Override
    public boolean doAction(String value) {
       int input = Integer.parseInt(value); 
if (input<1||input>10){
   System.out.println("\n*** Invalid selection *** Try again");

}
return false;
    }

}
    

