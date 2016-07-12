/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mansion.view;

import byui.cit260.mansion.model.Item.BackpackItem;

import byui.cit260.mansion.model.Item;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author che11_000
 */
public class SaveView extends View {

    public SaveView() {
        super("Where do you want to save the game at? or enter Q to quit."
        );
    }

    @Override
    public boolean doAction(String value) {
        PrintWriter outfile = null;
        try {

            outfile = new PrintWriter(value);
            out.println("\n-----------------------Backpack items-----------------------");
            out.printf("%n%-20s%5s%20s", "ItemName", "IndexNumber", "Description");
            out.printf("%n%-20s%5s%20s", "--------", "-----------", "-----------");

            BackpackItem[] items = BackpackItem.values();
            for (Item.BackpackItem item : items) {
                out.printf("%n%-20s%5d%28s", item.name(), item.ordinal(), item.getDescription());
                //out.println(item.name()+", "+item.ordinal());
            }
            outfile.flush();
        } catch (IOException ex) {
            out.println("\nError in saving process.");
        } finally {
            if (outfile != null) {
                outfile.close();
                out.println("\nYOur game has been saved.");

            }
        }

        // private void showItem() {
        //     ShowItemView showItem = new ShowItemView();
        //     showItem.display(); //To change body of generated methods, choose Tools | Templates.
        // }
        return true;
    }
}
