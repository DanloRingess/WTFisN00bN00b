package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends GameEntity implements Collidable {

    private Picture enemySprite;

    private int initialX = 900;
    private int intialY = 500;

    private int X;
    private int Y;

    private int dirX = -10;

    public Enemy() {

        enemySprite = new Picture(initialX, intialY, "assets/supernova.png");
        enemySprite.grow(-200, -100);
        this.X = initialX;
        this.Y = intialY;
    }

    @Override
    public void draw() {

        enemySprite.draw();

    }

    @Override
    void show() {

    }

    @Override
    public void hide() {

        enemySprite.delete();

    }

    @Override
    public void move() {

        this.X += dirX;
        enemySprite.translate(dirX, 0);

    }

    public void move(int lastX) {

        this.X = initialX;
        enemySprite.translate(initialX - lastX, 0);

    }


    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }
}
