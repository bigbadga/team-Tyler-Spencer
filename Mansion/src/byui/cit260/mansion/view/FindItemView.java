/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
           super("Which weapon are you looking for? Enter the name of the weapon below. (ei. knife)"
                
           
           );
    }

    @Override
    public boolean doAction(String value) {
    
        value=value.toUpperCase();
        BackpackItem[]items= BackpackItem.values();
        for (BackpackItem item : items) {
        if (item.name().equalsIgnoreCase(value)){
            System.out.println(indexof(item));
            
        }
        return false;
        }
   return false;
    }

    private boolean indexof(BackpackItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}