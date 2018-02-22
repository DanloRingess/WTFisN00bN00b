package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VanceMaximus extends Enemy {

    private Picture vinceSprite;

    private int initialX = 1000;
    private int initialY = 200;

    private int finalX = -700;
    private int finalY = 200;

    private Picture vinceSprite1 = new Picture(finalX, finalY, "assets/Vance_Maximus.png");
    private Picture vinceSprite2 = new Picture(finalX, finalY, "assets/Vance_Maximus_2.png");


    private int X;
    private int Y;

    private int dirX = -10;


    public VanceMaximus() {

        vinceSprite = vinceSprite1;
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

            vinceSprite1.translate(dirX, 0);
            vinceSprite2.translate(dirX, 0);
            this.X += dirX;

        if (this.X % 400 == 0) {
            vinceSprite.delete();
            vinceSprite = vinceSprite2;
            vinceSprite.draw();
            return;
        }

        if (this.X % 200 == 0) {
            vinceSprite.delete();
            vinceSprite = vinceSprite1;
            vinceSprite.draw();
        }
    }

    @Override
    public void moveBack(int lastX) {

        vinceSprite1.translate(initialX - lastX, 0);
        vinceSprite2.translate(initialX - lastX, 0);
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
