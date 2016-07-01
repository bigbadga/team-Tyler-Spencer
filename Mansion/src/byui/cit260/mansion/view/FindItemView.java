package byui.cit260.mansion.view;

import byui.cit260.mansion.model.Item;
import byui.cit260.mansion.model.Item.BackpackItem;
import static java.util.Collections.list;

/**
 *
 * @author che11_000
 */
public class FindItemView extends View{
    public FindItemView(){
           super("Which weapon are you looking for? Enter the name of the weapon below. (ei. knife) Enter Q to quit."
                
           
           );
    }

    @Override
    public boolean doAction(String value) {
    
        BackpackItem[]items= BackpackItem.values();
        for (BackpackItem item : items) {
        if (value.equals(item.name())){
            
            System.out.println("This is the index of the item you are looking for: "+item.ordinal());
            
        //}
       //else {
          //System.out.println("Invalid input, please try again or enter Q to quit.");
        //}
        //return false;
        }
  //return false;
   }
        return false;
}

    private boolean indexOf(BackpackItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}

   

    

