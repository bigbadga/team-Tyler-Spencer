package byui.cit260.mansion.model;

import java.io.Serializable;
/**
 *
 * @author tylerbadger
 */
public class Game implements Serializable{
    private double startTime;
    private double endTime;

    private Backpack backpack;
    private Player player;
    private Character character;

    
    private Item[] items;
    private Map map;
   


    private double totalTime;
    

    public Game() {
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public void setBackpack(Item[] backpackList) {
        
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.startTime) ^ (Double.doubleToLongBits(this.startTime) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.endTime) ^ (Double.doubleToLongBits(this.endTime) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.startTime) != Double.doubleToLongBits(other.startTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.endTime) != Double.doubleToLongBits(other.endTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "startTime=" + startTime + ", endTime=" + endTime + ", totalTime=" + totalTime + '}';
    }

}