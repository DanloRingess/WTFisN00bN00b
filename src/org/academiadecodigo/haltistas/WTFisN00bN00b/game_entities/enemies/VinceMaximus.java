package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VinceMaximus extends Enemy {

    private Picture vinceSprite;

    private int initialX = 1000;
    private int initialY = 200;

    private int finalX = -700;
    private int finalY = 200;

    private int X;
    private int Y;

    private int dirX = -10;
    private int dirY;

    private boolean rising = false;

    public VinceMaximus() {

        vinceSprite = new Picture(finalX, finalY, "assets/vince_maximus.png");
        this.X = finalX;
        this.Y = finalY;
        show();
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

        if (X > finalX) {
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

    @Override
    public int getFinalX() {
        return finalX;
    }
}
