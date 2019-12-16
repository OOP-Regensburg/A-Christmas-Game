import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.audio.AudioClip;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.KeyPressedEvent;
import config.Assets;
import config.GameConfig;
import intro.IntroScene;
import scenes.Scene;
import scenes.SceneListener;

public class SnowballFight extends GraphicsApp implements GameConfig, Assets, SceneListener {

    private Scene currentScene;

    @Override
    public void initialize() {
        setFrameRate(TARGET_FPS);
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
       currentScene = new IntroScene("Intro", this);
       currentScene.initialize();
    }

    private void setScene(Scene scene) {
        currentScene = scene;
        currentScene.initialize();
    }

    @Override
    public void draw() {
        drawBackground(Colors.WHITE);
        currentScene.update();
        currentScene.draw();
    }

    @Override
    public void onKeyPressed(KeyPressedEvent event){}

    @Override
    public void onSceneFinished(Scene scene) {}
}
