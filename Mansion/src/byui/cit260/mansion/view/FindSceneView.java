package byui.cit260.mansion.view;

import byui.cit260.mansion.model.Scene.SceneType;

/**
 *
 * @author tylerbadger
 */
public class FindSceneView extends View {
    public FindSceneView(){
        super("Which scene are you looking for? Enter the scene name, or enter 'Q' to quit.");
    }

    @Override
    public boolean doAction(String value) {
        SceneType[] scenes = SceneType.values();
        for(SceneType scene : scenes) {
            if(value.equals(scene.name())){
                System.out.println("The index of the scene is: " + scene.ordinal());
            }
        }
        return false;
    }
}
