package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrocuBot extends Enemy {

    Picture crocubotSprite;

    private int initialX = 1100;
    private int initialY = 450;

    private int finalX = -600;
    private int finalY = 450;

    private int X;
    private int Y;

    private int dirX = -10;

    public CrocuBot() {

        crocubotSprite = new Picture(finalX, finalY, "assets/crocubot.png");
        this.X = finalX;
        this.Y = finalY;
        show();
    }

    @Override
    public void show() {

        crocubotSprite.draw();
    }

    @Override
    public void hide() {

        crocubotSprite.delete();
    }

    @Override
    public void move() {

        if (X > finalX) {
            crocubotSprite.translate(dirX, 0);
            this.X += dirX;
        }
    }

    @Override
    public void moveBack(int lastX) {

        crocubotSprite.translate(initialX - lastX, 0);
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
        return crocubotSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return crocubotSprite.getHeight();
    }

    @Override
    public int getFinalX() {
        return finalX;
    }
}
