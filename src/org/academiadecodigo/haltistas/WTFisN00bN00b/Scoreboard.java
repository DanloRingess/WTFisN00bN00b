package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Scoreboard {

    private Text score, stage;
    private Game game;

    public Scoreboard(Game game) {

        this.game = game;

        this.score = new Text(1150, 61, "");
        this.score.grow(20, 20);
        this.stage = new Text(230, 64, "");
        this.stage.grow(15, 22);
    }

    public void show() {

        int level = (game.getCycleCounter() / 10) + 1;
        score.delete();
        score.setText("" + game.getTickCounter() / 5);
        score.setColor(Color.WHITE);
        score.draw();

        stage.delete();
        stage.setText("" + level);
        stage.setColor(Color.WHITE);
        stage.draw();

    }
}
