package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Supernova extends Enemy {

    private Picture supernovaSprite;

    private int initialX = 1000;
    private int initialY = 200;

    private int finalX = -700;
    private int finalY = 200;

    private int X;
    private int Y;

    private int dirX = -10;

    public Supernova() {

        supernovaSprite = new Picture(finalX, finalY, "assets/supernova.png");
        this.X = finalX;
        this.Y = finalY;
        show();
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

        if (X > finalX) {
            supernovaSprite.translate(dirX, 0);
            this.X += dirX;
        }
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

    @Override
    public int getFinalX() {
        return finalX;
    }
}

