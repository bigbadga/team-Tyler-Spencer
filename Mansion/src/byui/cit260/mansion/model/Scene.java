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
    private boolean blockedRoom;
    private static String mapSymbol;
    private int travelTime;

    public Scene() {
    }
    
    public enum SceneType {
        frontDoor,
        kitchen,
        living,
        guestRoom,
        theater,
        gym,
        hallway,
        bathroom,
        diningRoom,
        pianoRoom,
        bedroom,
        poolTable,
        library,
        secretRoom,
        garage,
        garden;
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

    public boolean getBlockedRoom() {
        return blockedRoom;
    }

    public void setBlockedRoom(boolean blockedRoom) {
        this.blockedRoom = blockedRoom;
    }

    public static String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        Scene.mapSymbol = mapSymbol;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.item);
        hash = 79 * hash + Objects.hashCode(this.clue);
        hash = 79 * hash + Objects.hashCode(this.blockedRoom);
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
        if (!Objects.equals(this.blockedRoom, other.blockedRoom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", item=" + item + ", clue=" + clue + ", blockedRoom=" + blockedRoom + '}';
    }
    
}