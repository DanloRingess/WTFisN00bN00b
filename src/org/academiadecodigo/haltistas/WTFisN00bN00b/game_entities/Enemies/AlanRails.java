package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class AlanRails extends Enemy {


    private final int initialX = 1000;

    private final int finalY = 400;

    private Picture alanSprite = new Picture(FINALX,finalY, "assets/Alan.png");

    private int X;

    public AlanRails()  {
        this.X = FINALX;
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

        alanSprite.translate(SPEED, 0);
        this.X += SPEED;
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return finalY;
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
