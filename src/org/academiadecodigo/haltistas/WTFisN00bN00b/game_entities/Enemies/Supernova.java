package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Supernova extends Enemy {

    private Picture supernovaSprite;

    private final int initialX = 1050;

    private final int finalY = 400;

    private Picture supernovaSprite1 = new Picture(FINALX, finalY, "assets/Supernova.png");
    private Picture supernovaSprite2 = new Picture(FINALX, finalY, "assets/Supernova_2.png");

    private int X;

    public Supernova() {

        supernovaSprite = supernovaSprite1;

        this.X = FINALX;
    }

    @Override
    public void show() {

        supernovaSprite.draw();
    }

    @Override
    public void move() {

        supernovaSprite1.translate(SPEED, 0);
        supernovaSprite2.translate(SPEED, 0);
        this.X += SPEED;

        if (this.X % 400 == 0) {
            supernovaSprite.delete();
            supernovaSprite = supernovaSprite2;
            supernovaSprite.draw();
            return;
        }

        if (this.X % 200 == 0) {
            supernovaSprite.delete();
            supernovaSprite = supernovaSprite1;
            supernovaSprite.draw();
        }
    }

    @Override
    public void moveBack(int lastX) {

        supernovaSprite1.translate(initialX - lastX, 0);
        supernovaSprite2.translate(initialX - lastX, 0);
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
        return supernovaSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return supernovaSprite.getHeight();
    }

}

