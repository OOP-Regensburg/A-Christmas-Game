package game;

import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.events.KeyPressedEvent;
import de.ur.mi.oop.graphics.Image;
import game.background.BackgroundObjects;
import game.player.Player;
import game.score.Scoreboard;
import game.snowballs.SnowBallListener;
import game.snowballs.SnowballDispenser;
import game.snowballs.SnowballSpeed;
import scenes.Scene;
import scenes.SceneListener;
import sprites.SpriteSet;

public class GameScene extends Scene implements GameConfig, Assets, SnowBallListener {

    private Image backgroundImage;
    private BackgroundObjects backgroundObjects;
    private Player player;
    private SnowballDispenser snowballDispenser;
    private Scoreboard scoreboard;
    private int score;

    public GameScene(String name, SceneListener listener) {
        super(name,listener);

    }

    public void initialize() {
        initBackground();
        initPlayer();
        initSnowballs();
        initScoreboard();
    }

    private void initBackground() {
        backgroundImage = new Image(0,0, BACKGROUND_IMAGE_PATH);
        backgroundObjects = new BackgroundObjects(0,0);
    }

    private void initSnowballs() {
        snowballDispenser = new SnowballDispenser(MAX_SNOWBALLS, SNOWBALL_SPAWN_DELAY);
        snowballDispenser.setSnowballListener(this);
        snowballDispenser.setSpeed(SnowballSpeed.SLOW);
        snowballDispenser.setTarget(player);
    }

    private void initPlayer() {
        SpriteSet[] sprites = new SpriteSet[2];
        sprites[0] = SpriteSet.createSet("running", PLAYER_SPRITES_RUNNING, PLAYER_ANIMATION_SPEED);
        sprites[1] = SpriteSet.createSet("jumping", PLAYER_SPRITES_JUMPING, PLAYER_ANIMATION_SPEED);
        player = new Player(GameConfig.PLAYER_START_POSITION_X,GameConfig.PLAYER_START_POSITION_Y, sprites);
    }

    private void initScoreboard() {
        score = 0;
        scoreboard = new Scoreboard(GameConfig.SCOREBOARD_POSITION_X,GameConfig.SCOREBOARD_POSITION_Y);
        scoreboard.setScore(score);
    }

    public void update() {
        backgroundObjects.update();
        player.update();
        snowballDispenser.update();
    }

    public void draw() {
        backgroundImage.draw();
        backgroundObjects.draw();
        player.draw();
        snowballDispenser.draw();
        scoreboard.draw();
    }

    public void onKeyPressed(KeyPressedEvent event) {
        if(event.getKeyCode() == KeyPressedEvent.VK_SPACE) {
            player.jump();
        }
    }

    @Override
    public void onSnowballHitPlayer() {
        score = 0;
        scoreboard.setScore(score);
    }

    @Override
    public void onSnowballLeftScreen() {
        score++;
        scoreboard.setScore(score);
    }
}
