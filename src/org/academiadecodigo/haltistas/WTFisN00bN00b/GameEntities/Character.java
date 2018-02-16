package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character extends GameEntity implements Collidable {

    private Picture characterSprite;

    private int intialX = -100;
    private int initialY = 350;

    private int X;
    private int Y;

    public Character() {

        characterSprite = new Picture(intialX,initialY,"assets/n00b_haltista.png");
        characterSprite.grow(-120,-200);
        this.X = intialX;
        this.Y = initialY;
    }

    public void move() {

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
}
