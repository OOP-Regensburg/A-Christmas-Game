package intro;

import de.ur.mi.oop.events.KeyPressedEvent;
import de.ur.mi.oop.graphics.Image;
import scenes.Scene;
import scenes.SceneListener;

public class IntroScene extends Scene {

    private Image backgroundImage;

    public IntroScene(String name, SceneListener listener) {
        super(name, listener);
    }

    @Override
    public void initialize() {
        backgroundImage = new Image(0,0,INTRO_CARD);
    }

    @Override
    public void draw() {
        backgroundImage.draw();
    }

    @Override
    public void onKeyPressed(KeyPressedEvent event) {
        if(event.getKeyCode() == KeyPressedEvent.VK_SPACE) {
            getListener().onSceneFinished(this);
        }
    }
}
