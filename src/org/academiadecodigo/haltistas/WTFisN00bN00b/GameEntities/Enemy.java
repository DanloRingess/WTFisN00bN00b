package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends GameEntity implements Collidable {

    private Picture enemyPic;

    private int initialX = 900;
    private int intialY = 500;

    private int X;
    private int Y;

    private int dirX = -10;

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
    public void move() {

        this.X += dirX;
        enemyPic.translate(dirX,0);

    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }
}
