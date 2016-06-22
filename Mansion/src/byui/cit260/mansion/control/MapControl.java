package byui.cit260.mansion.control;

import byui.cit260.mansion.model.Location;
import byui.cit260.mansion.model.Map;
import byui.cit260.mansion.model.Scene;

/**
 *
 * @author tylerbadger
 */
class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create a list of the different rooms in the game
        Scene[] scenes = createScenes();
        
        // assign the different rooms to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        
    }
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlockedRoom(false);
        startingScene.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;
        
        return scenes;
    }

    static void moveCharacterToStartingLocation(Map map) {
    }
    
}
