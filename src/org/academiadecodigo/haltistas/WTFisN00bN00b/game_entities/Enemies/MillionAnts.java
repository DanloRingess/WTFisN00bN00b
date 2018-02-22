package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MillionAnts extends Enemy {

    Picture antsSprite;

    private final int initialX = 1100;

    private final int finalY = 410;

    private Picture antsSprite1 = new Picture(FINALX, finalY, "assets/Million_ants.png");
    private Picture antsSprite2 = new Picture(FINALX, finalY, "assets/Million_ants_2.png");

    private boolean spriteState;

    private int X;

    public MillionAnts() {

        antsSprite = antsSprite1;
        spriteState = false;
        this.X = FINALX;
    }

    @Override
    public void show() {

        antsSprite.draw();
    }

    @Override
    public void move() {

        antsSprite1.translate(SPEED, 0);
        antsSprite2.translate(SPEED, 0);
        this.X += SPEED;

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
        return finalY;
    }

    @Override
    public int getWidth() {
        return antsSprite.getWidth();
    }

    @Override
    public int getHeight() {
        return antsSprite.getHeight();
    }

}
