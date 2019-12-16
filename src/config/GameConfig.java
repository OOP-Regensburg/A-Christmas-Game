package config;

public interface GameConfig {

    public static final int SCREEN_WIDTH = 320;
    public static final int SCREEN_HEIGHT = 288;
    public static final int TARGET_FPS = 60;
    public static final int PLAYER_JUMP_HEIGHT = 125;
    public static final int PLAYER_JUMP_SPEED = 5;
    public static final int PLAYER_HIT_BOX_RADIUS = 10;
    public static final int PLAYER_START_POSITION_X = 25;
    public static final int PLAYER_START_POSITION_Y = 120;
    public static final int PLAYER_ANIMATION_SPEED = 10;
    public static final int MAX_SNOWBALLS = 3;
    public static final int SNOWBALL_ANIMATION_SPEED = 30;
    public static final int SNOWBALL_SPAWN_DELAY = TARGET_FPS * 3;
    public static final int SNOWBALL_HEIGHT = 175;
    public static final int SCOREBOARD_POSITION_X = 220;
    public static final int SCOREBOARD_POSITION_Y = 30;
    public static final int MAX_SCORE = 999999;
}
