package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VanceMaximus extends Enemy {

    private Picture vinceSprite;

    private int initialX = 1000;
    private int initialY = 200;

    private int finalX = -700;
    private int finalY = 200;

    private Picture vinceSprite1 = new Picture(finalX, finalY, "assets/Vance_Maximus.png");
    private Picture vinceSprite2 = new Picture(finalX, finalY, "assets/Vance_Maximus_2.png");

    private boolean spriteState;

    private int X;
    private int Y;

    private int dirX = -10;
    private int dirY;

    private boolean rising = false;

    public VanceMaximus() {

        vinceSprite = vinceSprite1;
        spriteState = false;
        this.X = finalX;
        this.Y = finalY;
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

        if (this.X % 200 == 0) {
            changeSprite();
        }

        if (X > finalX) {
            if (Y < 251 && !rising) {

                dirY = 5;

                vinceSprite1.translate(dirX, dirY);
                vinceSprite2.translate(dirX, dirY);


                this.X += dirX;
                this.Y += dirY;

                if (Y == 250) {
                    rising = true;
                }
            }

            if (Y > 100 && rising) {

                dirY = -5;

                vinceSprite1.translate(dirX, dirY);
                vinceSprite2.translate(dirX, dirY);

                this.X += dirX;
                this.Y += dirY;

                if (Y == 100) {
                    rising = false;
                }
            }
        }
    }

    private void changeSprite() {

        if (spriteState) {
            vinceSprite.delete();
            vinceSprite = vinceSprite2;
            vinceSprite.draw();

            spriteState = false;
            return;
        }

        vinceSprite.delete();
        vinceSprite = vinceSprite1;
        vinceSprite.draw();

        spriteState = true;
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
