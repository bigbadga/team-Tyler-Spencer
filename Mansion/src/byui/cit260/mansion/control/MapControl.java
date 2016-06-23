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
        locations[1][0].setScene(scenes[SceneType.living.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.diningroom.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.pianoroom.ordinal()]);
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
        
        Scene theater = new Scene();
        bedroom.setDescription("");
        bedroom.setMapSymbol(" T ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.theater.ordinal()] = theater;
        
        
        Scene gym = new Scene();
        bedroom.setDescription("");
        bedroom.setMapSymbol(" G ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.gym.ordinal()] = gym;
        
        Scene hallway = new Scene();
        bedroom.setDescription("");
        bedroom.setMapSymbol(" G ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.hallway.ordinal()] = hallway;
        
        Scene bathroom = new Scene();
        bedroom.setDescription("");
        bedroom.setMapSymbol(" BA ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.bathroom.ordinal()] = bathroom;
        
        Scene diningroom = new Scene();
        bedroom.setDescription("");
        bedroom.setMapSymbol(" DI ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.diningroom.ordinal()] = diningroom;
        
         Scene piano = new Scene();
        bedroom.setDescription("");
        bedroom.setMapSymbol(" DI ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.pianoroom.ordinal()] = piano;
        
        return scenes;
        
        
    }

    static void moveCharacterToStartingLocation(Map map) {
    }
    
}