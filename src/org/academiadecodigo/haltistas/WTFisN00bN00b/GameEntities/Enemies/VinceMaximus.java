package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VinceMaximus extends Enemy {

    private Picture vinceSprite;

    private int initialX = 900;
    private int initialY = 100;

    private int X;
    private int Y;

    private int dirX = -10;
    private int dirY;

    private boolean rising = false;

    public VinceMaximus() {

        vinceSprite = new Picture(initialX, initialY, "assets/vince_maximus.png");
        this.X = initialX;
        this.Y = initialY;
    }

    @Override
    public void show() {

        vinceSprite.draw();

    }

    @Override
    public void hide() {

        vinceSprite.delete();

    }

    @Override
    public void move() {

        if (Y < 251 && !rising) {

            dirY = 5;

            vinceSprite.translate(dirX, dirY);

            this.X += dirX;
            this.Y += dirY;

            if (Y == 250) {
                rising = true;
            }
        }

        if (Y > 100 && rising) {

            dirY = -5;

            vinceSprite.translate(dirX, dirY);

            this.X += dirX;
            this.Y += dirY;

            if (Y == 100) {
                rising = false;
            }
        }


    }

    @Override
    public void moveBack(int lastX) {

        vinceSprite.translate(initialX - lastX, 0);
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
        return vinceSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return vinceSprite.getHeight();
    }
}
