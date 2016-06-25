package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tylerbadger
 */
public class Map implements Serializable{
    private Integer noOfRows;
    private Integer noOfColumns;
    private static Location[][] locations;

    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        Map.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
    }

    public Integer getNumberOfRows() {
        return noOfRows;
    }

    public void setNumberOfRows(Integer numberOfRows) {
        this.noOfRows = numberOfRows;
    }

    public Integer getNumberOfColumns() {
        return noOfColumns;
    }

    public void setNumberOfColumns(Integer numberOfColumns) {
        this.noOfColumns = numberOfColumns;
    }

    public static Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        Map.locations = locations;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.noOfRows);
        hash = 47 * hash + Objects.hashCode(this.noOfColumns);
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
        if (!Objects.equals(this.noOfRows, other.noOfRows)) {
            return false;
        }
        if (!Objects.equals(this.noOfColumns, other.noOfColumns)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "numberOfRows=" + noOfRows + ", numberOfColumns=" + noOfColumns + '}';
    }
    
}
