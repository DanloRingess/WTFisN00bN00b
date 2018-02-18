package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Scoreboard {


    private int x;
    private int y;
    private int score = 120;
    private Text text;


    public Scoreboard(int x, int y) {
        this.x = x;
        this.y = y;
        this.text = new Text(x,y,"score: " + score);
    }

    public void init(){
        text.setColor(Color.WHITE);
        text.grow(20,20 );
        text.draw();


    }

    public void setScore(int score) {
        this.score = score;
    }
}
