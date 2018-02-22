package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrocuBot extends Enemy {

    private Picture crocubotSprite;

    private final int initialX = 1000;

    private final int finalY = 410;

    private Picture crocubotSprite1 = new Picture(FINALX, finalY, "assets/Crocubot.png");
    private Picture crocubotSprite2 = new Picture(FINALX, finalY, "assets/Crocubot_2.png");

    private int X;

    public CrocuBot() {

        crocubotSprite = crocubotSprite1;
        this.X = FINALX;
    }

    @Override
    public void show() {

        crocubotSprite.draw();
    }

    @Override
    public void move() {

        crocubotSprite1.translate(SPEED, 0);
        crocubotSprite2.translate(SPEED, 0);
        this.X += SPEED;


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
        return finalY;
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
