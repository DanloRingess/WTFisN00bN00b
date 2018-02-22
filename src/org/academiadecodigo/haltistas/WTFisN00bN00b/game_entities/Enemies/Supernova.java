package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Supernova extends Enemy {

    private Picture supernovaSprite;

    private int initialX = 1050;

    private int finalX = -700;
    private int finalY = 400;

    private Picture supernovaSprite1 = new Picture(finalX, finalY, "assets/Supernova.png");
    private Picture supernovaSprite2 = new Picture(finalX, finalY, "assets/Supernova_2.png");

    private int X;
    private int Y;

    private int dirX = -10;

    public Supernova() {

        supernovaSprite = supernovaSprite1;

        this.X = finalX;
        this.Y = finalY;
    }

    @Override
    public void show() {

        supernovaSprite.draw();
    }

    @Override
    public void move() {

        supernovaSprite1.translate(dirX, 0);
        supernovaSprite2.translate(dirX, 0);
        this.X += dirX;

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

