/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mansion.view;

import byui.cit260.mansion.model.Item.BackpackItem;

import byui.cit260.mansion.model.Item;

/**
 *
 * @author che11_000
 */
public class SaveView extends View {

    public SaveView() {
        super("Are you sure you want to save the game? Y=YES, Q= NO and Quit"
        );
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        if (value.equals ("Y")) {
            BackpackItem[]items= BackpackItem.values();
            for (Item.BackpackItem item : items) {
            System.out.println(item.name()+", "+item.ordinal());
            }

        }

        return false;
    }

    // private void showItem() {
    //     ShowItemView showItem = new ShowItemView();
    //     showItem.display(); //To change body of generated methods, choose Tools | Templates.
    // }
}
