import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.audio.AudioClip;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.KeyPressedEvent;
import config.Assets;
import config.GameConfig;
import game.GameScene;
import intro.IntroScene;
import scenes.Scene;
import scenes.SceneListener;

public class SnowballFight extends GraphicsApp implements GameConfig, Assets, SceneListener {

    private Scene currentScene;
    private AudioClip backgroundMusic;

    @Override
    public void initialize() {
        setFrameRate(TARGET_FPS);
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setScene(new IntroScene("Intro", this));
        initBackgroundMusic();
    }

    private void setScene(Scene scene) {
        currentScene = scene;
        currentScene.initialize();
    }

    private void initBackgroundMusic() {
        backgroundMusic = new AudioClip(BACKGROUND_MUSIC_PATH);
        backgroundMusic.loop();
    }

    @Override
    public void draw() {
        drawBackground(Colors.WHITE);
        currentScene.update();
        currentScene.draw();
    }

    @Override
    public void onKeyPressed(KeyPressedEvent event) {
        currentScene.onKeyPressed(event);
    }

    @Override
    public void onSceneFinished(Scene scene) {
        setScene(new GameScene("Game", this));
    }
}
