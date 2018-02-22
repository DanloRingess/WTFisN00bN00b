package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrocuBot extends Enemy {

    private Picture crocubotSprite;

    private int initialX = 1000;

    private int finalX = -600;
    private int finalY = 410;

    private Picture crocubotSprite1 = new Picture(finalX, finalY, "assets/Crocubot.png");
    private Picture crocubotSprite2 = new Picture(finalX, finalY, "assets/Crocubot_2.png");

    private int X;
    private int Y;

    private int dirX = -10;

    public CrocuBot() {

        crocubotSprite = crocubotSprite1;
        this.X = finalX;
        this.Y = finalY;
    }

    @Override
    public void show() {

        crocubotSprite.draw();
    }

    @Override
    public void move() {

        crocubotSprite1.translate(dirX, 0);
        crocubotSprite2.translate(dirX, 0);
        this.X += dirX;


        if (this.X % 400 == 0) {
            crocubotSprite.delete();
            crocubotSprite = crocubotSprite2;
            crocubotSprite.draw();
            return;
        }

        if (this.X % 200 == 0) {
            crocubotSprite.delete();
            crocubotSprite = crocubotSprite1;
            crocubotSprite.draw();
        }

    }

    @Override
    public void moveBack(int lastX) {

        crocubotSprite1.translate(initialX - lastX, 0);
        crocubotSprite2.translate(initialX - lastX, 0);
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

}
