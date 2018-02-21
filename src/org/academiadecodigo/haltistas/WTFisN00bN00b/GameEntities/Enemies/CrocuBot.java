package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrocuBot extends Enemy {

    private Picture crocubotSprite1;
    private Picture crocubotSprite2;

    private int initialX = 1000;
    private int initialY = 400;

    private int finalX = -600;
    private int finalY = 400;

    private int X;
    private int Y;

    private int dirX = -10;

    public CrocuBot() {

        crocubotSprite1 = new Picture(finalX, finalY, "assets/Crocubot.png");
        crocubotSprite2 = new Picture(finalX, finalY, "assets/Crocubot_2.png");
        this.X = finalX;
        this.Y = finalY;
        show();
    }

    @Override
    public void show() {

        crocubotSprite1.draw();
    }

    @Override
    public void hide() {

        crocubotSprite1.delete();
    }

    @Override
    public void move() {

        if (X > finalX) {
            crocubotSprite1.translate(dirX, 0);
            this.X += dirX;
        }
    }

    @Override
    public void moveBack(int lastX) {

        crocubotSprite1.translate(initialX - lastX, 0);
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
        return crocubotSprite1.getWidth();
    }

    @Override
    public int getHeight() {
        return crocubotSprite1.getHeight();
    }

    @Override
    public int getFinalX() {
        return finalX;
    }
}
