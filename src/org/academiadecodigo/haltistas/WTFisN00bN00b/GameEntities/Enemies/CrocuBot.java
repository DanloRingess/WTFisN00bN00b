package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrocuBot extends Enemy {

    Picture crocubotSprite;

    private int initialX = 850;
    private int intialY = 100;

    private int X;
    private int Y;

    private int dirX = -10;

    public CrocuBot() {

        crocubotSprite = new Picture(initialX, intialY, "assets/crocubot.png");
        crocubotSprite.grow(-300, -400);
        this.X = initialX;
        this.Y = intialY;
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

        crocubotSprite.translate(dirX,0);
        this.X += dirX;
    }

    @Override
    public void moveBack(int lastX) {

        crocubotSprite.translate(initialX - lastX, 0);
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
