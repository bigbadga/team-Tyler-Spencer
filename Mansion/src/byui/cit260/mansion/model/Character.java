package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tylerbadger
 */
public class Character implements Serializable {
    
   //Class instance variables
    private String name;
    private String description;
    private Integer columnCoordinate;
    private Integer rowCoordinate;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getColumnCoordinate() {
        return columnCoordinate;
    }

    public void setColumnCoordinate(Integer columnCoordinate) {
        this.columnCoordinate = columnCoordinate;
    }

    public Integer getRowCoordinate() {
        return rowCoordinate;
    }

    public void setRowCoordinate(Integer rowCoordinate) {
        this.rowCoordinate = rowCoordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.columnCoordinate);
        hash = 67 * hash + Objects.hashCode(this.rowCoordinate);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.columnCoordinate, other.columnCoordinate)) {
            return false;
        }
        if (!Objects.equals(this.rowCoordinate, other.rowCoordinate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", columnCoordinate=" + columnCoordinate + ", rowCoordinate=" + rowCoordinate + '}';
    }

    
}
