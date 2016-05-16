package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tylerbadger
 */
public class Map implements Serializable{
    private Integer numberOfRows;
    private Integer numberOfColumns;

    public Map() {
    }

    public Integer getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(Integer numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public Integer getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(Integer numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.numberOfRows);
        hash = 47 * hash + Objects.hashCode(this.numberOfColumns);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.numberOfRows, other.numberOfRows)) {
            return false;
        }
        if (!Objects.equals(this.numberOfColumns, other.numberOfColumns)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "numberOfRows=" + numberOfRows + ", numberOfColumns=" + numberOfColumns + '}';
    }
    
    
}
