package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author che11_000
 */
public class Item implements Serializable{
 //class instance variable
    private String itemName;
    private String description;
    private String content;
    private int itemAmount;

    public Item() {
    }
    
    public enum BackpackItem {
        gun,
        hammer,
        knife,
        file,
        clue;
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
