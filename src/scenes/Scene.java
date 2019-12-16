package scenes;

import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.events.KeyPressedEvent;

public class Scene implements GameConfig, Assets {

    private String name;
    private SceneListener listener;

    public Scene(String name, SceneListener listener) {
        this.name = name;
        this.listener = listener;
    }

    public String getName() {
        return name;
    }

    public SceneListener getListener() {
        return listener;
    }

    public void initialize() {

    }

    public void update() {

    }

    public void draw() {

    }

    public void onKeyPressed(KeyPressedEvent event) {

    }
}
