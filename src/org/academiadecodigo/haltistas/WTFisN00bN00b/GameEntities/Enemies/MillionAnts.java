package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MillionAnts extends Enemy {

    Picture antsSprite;

    private int initialX = 1200;
    private int initialY = 500;

    Picture antsSprite1 = new Picture(initialX, initialY, "assets/million_ants.png");
    Picture antsSprite2 = new Picture(initialX, initialY, "assets/million_ants_2.png");

    private int X;
    private int Y;

    private int dirX = -10;

    public MillionAnts() {

        antsSprite = antsSprite1;
        this.X = initialX;
        this.Y = initialY;
    }

    @Override
    public void show() {

        antsSprite.draw();
    }

    @Override
    public void hide() {

        antsSprite.delete();
    }

    @Override
    public void move() {

        antsSprite1.translate(dirX,0);
        antsSprite2.translate(dirX, 0);
        this.X += dirX;

        if (this.X % 400 == 0 ) {
            antsSprite.delete();
            antsSprite = antsSprite2;
            antsSprite.draw();
            return;
        }

        if (this.X % 200 == 0) {
            antsSprite.delete();
            antsSprite = antsSprite1;
            antsSprite.draw();
        }
    }

    @Override
    public void moveBack(int lastX) {

        antsSprite1.translate(initialX - lastX, 0);
        antsSprite2.translate(initialX - lastX, 0);
        this.X  = initialX;
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
        return antsSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return antsSprite.getHeight();
    }
}
