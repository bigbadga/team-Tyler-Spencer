/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author che11_000
 */
public class Scene implements Serializable{
    private String description;
    private String item;
    private String clue;
    private String blockedroom;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public String getBlockedroom() {
        return blockedroom;
    }

    public void setBlockedroom(String blockedroom) {
        this.blockedroom = blockedroom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.item);
        hash = 79 * hash + Objects.hashCode(this.clue);
        hash = 79 * hash + Objects.hashCode(this.blockedroom);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.clue, other.clue)) {
            return false;
        }
        if (!Objects.equals(this.blockedroom, other.blockedroom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", item=" + item + ", clue=" + clue + ", blockedroom=" + blockedroom + '}';
    }
    
}