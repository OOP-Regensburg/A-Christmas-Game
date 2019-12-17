import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.KeyPressedEvent;
import config.Assets;
import config.GameConfig;

public class SnowballFight extends GraphicsApp implements GameConfig, Assets {


    @Override
    public void initialize() {
        setFrameRate(TARGET_FPS);
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBackground(Colors.WHITE);
    }

    @Override
    public void onKeyPressed(KeyPressedEvent event){}

}
