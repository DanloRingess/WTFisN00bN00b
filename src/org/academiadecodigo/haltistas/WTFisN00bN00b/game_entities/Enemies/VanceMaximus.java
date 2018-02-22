package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VanceMaximus extends Enemy {

    private Picture vinceSprite;

    private final int initialX = 900;

    private final int finalY = 320;

    private Picture vinceSprite1 = new Picture(FINALX, finalY, "assets/Vance_Maximus.png");
    private Picture vinceSprite2 = new Picture(FINALX, finalY, "assets/Vance_Maximus_2.png");


    private int X;

    public VanceMaximus() {

        vinceSprite = vinceSprite1;
        this.X = FINALX;
    }

    @Override
    public void show() {

        vinceSprite.draw();
    }

    @Override
    public void move() {

            vinceSprite1.translate(SPEED, 0);
            vinceSprite2.translate(SPEED, 0);
            this.X += SPEED;

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
        return finalY;
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
