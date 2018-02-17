package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Supernova extends Enemy {

    private Picture supernovaSprite;

    private int initialX = 900;
    private int initialY = 200;

    private int X;
    private int Y;

    private int dirX = -10;

    public Supernova() {

        supernovaSprite = new Picture(initialX, initialY, "assets/supernova.png");
        supernovaSprite.grow(-200, -100);
        this.X = initialX;
        this.Y = initialY;
    }

    @Override
    public void show() {

        supernovaSprite.draw();

    }

    @Override
    public void hide() {

        supernovaSprite.delete();

    }

    @Override
    public void move() {

        supernovaSprite.translate(dirX, 0);
        this.X += dirX;
    }

    @Override
    public void moveBack(int lastX) {

        supernovaSprite.translate(initialX - lastX, 0);
        this.X = initialX;
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
        return supernovaSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return supernovaSprite.getHeight();
    }
}

