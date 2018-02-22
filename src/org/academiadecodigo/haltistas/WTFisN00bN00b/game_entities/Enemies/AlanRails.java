package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class AlanRails extends Enemy {


    private int initialX = 1000;

    private int finalX = -600;
    private int finalY = 400;

    private Picture alanSprite = new Picture(finalX,finalY, "assets/Alan.png");

    private int X;
    private int Y;

    private int dirX = -10;

    public AlanRails()  {
        this.X = finalX;
        this.Y = finalY;
        alanSprite.draw();
    }

    @Override
    public void moveBack(int lastX) {
        alanSprite.translate(initialX - lastX, 0);
        this.X = initialX;
    }

    @Override
    public void show() {
        alanSprite.draw();
    }

    @Override
    public void move() {

        alanSprite.translate(dirX, 0);
        this.X += dirX;
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }

    @Override
    public int getWidth() {
        return alanSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return alanSprite.getHeight();
    }

}
