package byui.cit260.mansion.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tylerbadger
 */
public class Location implements Serializable{
    private String description;
    private static Integer row;
    private Integer column;
    private Character character;
    private static boolean visited;
    private Scene scene;


    public Location() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        Location.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }


    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public static boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        Location.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.row);
        hash = 79 * hash + Objects.hashCode(this.column);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "description=" + description + ", row=" + row + ", column=" + column + '}';
    }
    
}
