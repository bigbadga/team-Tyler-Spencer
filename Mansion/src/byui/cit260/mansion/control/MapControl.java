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
        locations[0][0].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.frontDoor.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.diningRoom.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.bedroom.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.pianoRoom.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.poolTable.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.gym.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.library.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.guestRoom.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.living.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.secretRoom.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.garden.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.garage.ordinal()]);
    }
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        
        Scene frontDoor = new Scene();
        frontDoor.setDescription("Main entrance to enter this mansion.");
        frontDoor.setMapSymbol(" ST ");
        frontDoor.setBlockedRoom(false);
        frontDoor.setTravelTime(0);
        scenes[Scene.SceneType.frontDoor.ordinal()] = frontDoor;
        
        Scene kitchen = new Scene();
        kitchen.setDescription("It has hallways around it. People can walk around there freely.");
        kitchen.setMapSymbol(" K ");
        kitchen.setBlockedRoom(false);
        kitchen.setTravelTime(0);
        scenes[Scene.SceneType.kitchen.ordinal()] = kitchen;
        
        Scene living = new Scene();
        living.setDescription("It is a huge and luxury livingroom that is connected to the gym.");
        living.setMapSymbol(" LR ");
        living.setBlockedRoom(false);
        living.setTravelTime(0);
        scenes[Scene.SceneType.living.ordinal()] = living;
        
        Scene guestRoom = new Scene();
        guestRoom.setDescription("It is almost at the center of the mansion.");
        guestRoom.setMapSymbol(" GR ");
        guestRoom.setBlockedRoom(false);
        guestRoom.setTravelTime(0);
        scenes[Scene.SceneType.guestRoom.ordinal()] = guestRoom;
        
        Scene bedroom = new Scene();
        bedroom.setDescription("Where the body was found.");
        bedroom.setMapSymbol(" B ");
        bedroom.setBlockedRoom(false);
        bedroom.setTravelTime(0);
        scenes[Scene.SceneType.bedroom.ordinal()] = bedroom;
        
        Scene theater = new Scene();
        theater.setDescription("A nice theater to relax.");
        theater.setMapSymbol(" T ");
        theater.setBlockedRoom(false);
        theater.setTravelTime(0);
        scenes[Scene.SceneType.theater.ordinal()] = theater;
        
        
        Scene gym = new Scene();
        gym.setDescription("It is right next to the bedroom. A path the murderer may have been.");
        gym.setMapSymbol(" G ");
        gym.setBlockedRoom(false);
        gym.setTravelTime(0);
        scenes[Scene.SceneType.gym.ordinal()] = gym;
        
        Scene hallway = new Scene();
        hallway.setDescription("");
        hallway.setMapSymbol(" H ");
        hallway.setBlockedRoom(false);
        hallway.setTravelTime(0);
        scenes[Scene.SceneType.hallway.ordinal()] = hallway;
        
        Scene bathroom = new Scene();
        bathroom.setDescription("Both Bathroom are right net to the hallway.");
        bathroom.setMapSymbol(" BA ");
        bathroom.setBlockedRoom(false);
        bathroom.setTravelTime(0);
        scenes[Scene.SceneType.bathroom.ordinal()] = bathroom;
        
        Scene diningRoom = new Scene();
        diningRoom.setDescription("Diningroom is right in front of the frontDoor.");
        diningRoom.setMapSymbol(" DI ");
        diningRoom.setBlockedRoom(false);
        diningRoom.setTravelTime(0);
        scenes[Scene.SceneType.diningRoom.ordinal()] = diningRoom;
        
         Scene pianoRoom = new Scene();
        pianoRoom.setDescription("PianoRoom is at the center of the mansion, so people can hear the music.");
        pianoRoom.setMapSymbol(" PR ");
        pianoRoom.setBlockedRoom(false);
        pianoRoom.setTravelTime(0);
        scenes[Scene.SceneType.pianoRoom.ordinal()] = pianoRoom;
        
        Scene poolTable = new Scene();
        poolTable.setDescription("High class pool table right next to the piano and gym. There is a strange thing attached to it. You better check it out.");
        poolTable.setMapSymbol(" PT ");
        poolTable.setBlockedRoom(false);
        pianoRoom.setTravelTime(0);
        scenes[Scene.SceneType.poolTable.ordinal()] = poolTable;
        
        Scene library = new Scene();
        library.setDescription("Filled with all kinds of books and is surrounded by the hallways. The space seems quit small..");
        library.setMapSymbol(" LB ");
        library.setBlockedRoom(false);
        library.setTravelTime(0);
        scenes[Scene.SceneType.library.ordinal()] = library;
        
        Scene secretRoom = new Scene();
        secretRoom.setDescription("It is loacted at the corner of the mansion. You should look into it since it is called secret room.");
        secretRoom.setMapSymbol(" SR ");
        secretRoom.setBlockedRoom(true);
        secretRoom.setTravelTime(0);
        scenes[Scene.SceneType.secretRoom.ordinal()] = secretRoom;
        
        Scene garage = new Scene();
        garage.setDescription("There are 2 BMW sport cars, 1 Porsch, and a Mercedez. Honestly, not a convenient spot to get around.");
        garage.setMapSymbol(" GA ");
        garage.setBlockedRoom(false);
        garage.setTravelTime(0);
        scenes[Scene.SceneType.garage.ordinal()] = garage;
        
        Scene garden = new Scene();
        garden.setDescription("An indoor garden whith several kinds of plants. One of them is poiseness.");
        garden.setMapSymbol(" GD ");
        garden.setBlockedRoom(false);
        garden.setTravelTime(0);
        scenes[Scene.SceneType.garden.ordinal()] = garden;
        
        return scenes;
        
    }

    static void moveCharacterToStartingLocation(Map map) {
    }
    
}