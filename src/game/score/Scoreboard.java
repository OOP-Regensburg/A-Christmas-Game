package game.score;

import config.GameConfig;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Label;

public class Scoreboard implements GameConfig {

    private Label label;

    public Scoreboard(int xPos, int yPos) {
        this.label = new Label(xPos, yPos, "");
        this.label.setFont("Monospaced");
        this.label.setFontSize(24);
        this.label.setColor(Colors.WHITE);
    }

    public void setScore(int score) {
        int scoreStringTargetLength = String.valueOf(MAX_SCORE).length();
        String currentScore = String.valueOf(score);
        while(currentScore.length() < scoreStringTargetLength) {
            currentScore = "0" + currentScore;
        }
        label.setText(currentScore);
    }

    public void draw() {
        label.draw();
    }
}
