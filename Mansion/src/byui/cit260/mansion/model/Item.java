package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author che11_000
 */
public class Item implements Serializable {

    public static Iterable<String> BackpackItem;
    //class instance variable
    private String itemName;
    private String description;
    private String content;
    private int itemAmount;

    public Item() {
    }

    public enum BackpackItem {

        gun("gun", "Useful weapon, but can be dangerous."),
        hammer("hammer","This hammer can be use to fix things."),
        knife("knife","this might be the weapon that the murderer used to kill the victim."),
        file1("file1","Suspect's file"),
        file2("file2","Suspect's file"),
        file3("file3","Suspect's file"),
        file4("file4","Suspect's file"),
        file5("file5","Suspect's file"),
        file6("file6","Suspect's file"),
        file7("file7","Suspect's file"),
        clue1("clue1","Clue you found"),
        clue2("clue2","Clue you found"),
        clue3("clue3","Clue you found"),
        clue4("clue4","Clue you found"),
        clue5("clue5","Clue you found"),
        clue6("clue6","Clue you found");
        
        private final String name;
        private final String description;
        BackpackItem(String name, String description){
         this.description=description;
         this.name=name;
        }
        public String getName(){
         return name;
        }
         public String getDescription(){
         return description;
        }

        public boolean getValue() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.itemName);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.content);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", description=" + description + ", content=" + content + '}';
    }

}
