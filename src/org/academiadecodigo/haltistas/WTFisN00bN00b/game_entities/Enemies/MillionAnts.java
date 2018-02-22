package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MillionAnts extends Enemy {

    Picture antsSprite;

    private int initialX = 1100;
    private int initialY = 400;

    private int finalX = -600;
    private int finalY = 400;

    Picture antsSprite1 = new Picture(finalX, finalY, "assets/Million_ants.png");
    Picture antsSprite2 = new Picture(finalX, finalY, "assets/Million_ants_2.png");

    private boolean spriteState;

    private int X;
    private int Y;

    private int dirX = -10;

    public MillionAnts() {

        antsSprite = antsSprite1;
        spriteState = false;
        this.X = finalX;
        this.Y = initialY;
    }

    @Override
    public void show() {

        antsSprite.draw();
    }

    @Override
    public void hide() {

        antsSprite.delete();
    }

    @Override
    public void move() {

        antsSprite1.translate(dirX, 0);
        antsSprite2.translate(dirX, 0);
        this.X += dirX;

        if (this.X % 200 == 0) {
            changeSprite();
        }
    }

    private void changeSprite() {

        if (spriteState) {
            antsSprite.delete();
            antsSprite = antsSprite1;
            antsSprite.draw();

            spriteState = false;
            return;
        }

        antsSprite.delete();
        antsSprite =  antsSprite2;
        antsSprite.draw();

        spriteState = true;
    }

    @Override
    public void moveBack(int lastX) {

        antsSprite1.translate(initialX - lastX, 0);
        antsSprite2.translate(initialX - lastX, 0);
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
        return antsSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return antsSprite.getHeight();
    }

    @Override
    public int getFinalX() {
        return finalX;
    }
}
