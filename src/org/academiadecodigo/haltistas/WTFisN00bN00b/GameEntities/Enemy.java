package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends GameEntity implements Collidable {

    private Picture enemyPic;
    private int initialX = 900;
    private int intialY = 500;

    private int X;
    private int Y;

    private int dirX;
    private int dirY;

    public Enemy() {

        enemyPic = new Picture(initialX, intialY, "assets/supernova.png");
        enemyPic.grow(-200,-100);
        this.X = initialX;
        this.Y = intialY;
    }

    @Override
    public void draw() {

        enemyPic.draw();

    }

    @Override
    void show() {

    }

    @Override
    public void hide() {

        enemyPic.delete();

    }

    @Override
    void move() {



    }
}
