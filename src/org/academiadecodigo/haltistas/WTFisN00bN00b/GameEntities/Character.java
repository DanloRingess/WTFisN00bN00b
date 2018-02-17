package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character extends GameEntity {

    private Picture characterSprite;

    private boolean goingUp;

    private int intialX = -100;
    private int initialY = 350;

    private int X;
    private int Y;

    private int dirY;

    public Character() {

        characterSprite = new Picture(intialX, initialY, "assets/n00b_haltista.png");
        characterSprite.grow(-120, -200);
        goingUp = false;
        this.X = intialX;
        this.Y = initialY;
    }

    @Override
    public void move() {

        this.Y += dirY;
        characterSprite.translate(0, dirY);
    }

    @Override
    public void show() {

        characterSprite.draw();

    }

    @Override
    public void hide() {

        characterSprite.delete();

    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getWidth() {
        return characterSprite.getWidth();
    }

    public int getHeight() {
        return characterSprite.getHeight();
    }

    public boolean isGoingUp() {
        return goingUp;
    }

    public void setGoingUp(boolean goingUp) {
        this.goingUp = goingUp;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }


}
