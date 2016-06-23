package byui.cit260.mansion.control;

import byui.cit260.mansion.model.Location;
import byui.cit260.mansion.model.Map;
import byui.cit260.mansion.model.Scene;
import byui.cit260.mansion.model.Scene.SceneType;

/**
 *
 * @author tylerbadger
 */
class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(5, 5);
        
        // create a list of the different rooms in the game
        Scene[] scenes = createScenes();
        
        // assign the different rooms to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.living.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.living.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.living.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.living.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.living.ordinal()]);
    }
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlockedRoom(false);
        startingScene.setTravelTime(0);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;
        
        Scene kitchen = new Scene();
        kitchen.setDescription("");
        kitchen.setMapSymbol(" K ");
        kitchen.setBlockedRoom(false);
        kitchen.setTravelTime(0);
        scenes[Scene.SceneType.kitchen.ordinal()] = kitchen;
        
        Scene living = new Scene();
        living.setDescription("");
        living.setMapSymbol(" L ");
        living.setBlockedRoom(false);
        living.setTravelTime(0);
        scenes[Scene.SceneType.living.ordinal()] = living;
        
        Scene guestRoom = new Scene();
        guestRoom.setDescription("");
        guestRoom.setMapSymbol(" GR ");
        guestRoom.setBlockedRoom(false);
        guestRoom.setTravelTime(0);
        scenes[Scene.SceneType.guestRoom.ordinal()] = guestRoom;
        
        Scene bedroom = new Scene();
        bedroom.setDescription("");
        bedroom.setMapSymbol(" B ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.bedroom.ordinal()] = bedroom;
        
        return scenes;
    }

    static void moveCharacterToStartingLocation(Map map) {
    }
    
}