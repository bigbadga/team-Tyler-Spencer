package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author che11_000
 */
public class Backpack implements Serializable{
    private Integer itemAmount;
    private Integer clueAmount;
public Backpack() {
    }

    public Integer getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Integer itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Integer getClueAmount() {
        return clueAmount;
    }

    public void setClueAmount(Integer clueAmount) {
        this.clueAmount = clueAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.itemAmount);
        hash = 67 * hash + Objects.hashCode(this.clueAmount);
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
        final Backpack other = (Backpack) obj;
        if (!Objects.equals(this.itemAmount, other.itemAmount)) {
            return false;
        }
        if (!Objects.equals(this.clueAmount, other.clueAmount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Backpack{" + "itemAmount=" + itemAmount + ", clueAmount=" + clueAmount + '}';
    }

}
