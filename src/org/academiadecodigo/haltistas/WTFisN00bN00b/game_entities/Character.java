package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character extends GameEntity implements Collidable {

    private Picture characterSprite;

    private boolean jumping;

    private int intialX = 80;
    private int initialY = 500;

    private int X;
    private int Y;

    private int dirY;

    public Character() {

    characterSprite = new Picture(intialX, initialY, "assets/N00b.png");
        jumping = false;
        this.X = intialX;
        this.Y = initialY;
    }

    @Override
    public void move() {

        if (!jumping) {
            return;
        }

        this.Y += dirY;
        characterSprite.translate(0, dirY);

        if (Y <= 100) {
            fall();

        }

        if (Y >= initialY) {
            jumping = false;
        }
    }

    public void jump(){
        if (!jumping) {

            dirY = -10;
            jumping = true;
        }
    }

    private void fall() {

        dirY = 8;
    }

    public void crouch() {

        if (jumping) {
            dirY = 12;
        }
    }


    @Override
    public void show() {

        characterSprite.draw();
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

    @Override
    public boolean collides(Collidable gameEntity) {
        //the padding creates a sub rectangle that's smaller in percentage,
        //padding = 0 is the original rectangle
        // padding = 1 is a rectangle of area 0.

        double padding = .3;


        //calculation of the minimum value of x of this class
        double xMinC = getX() + .5 * padding * getWidth();

        //calculation of the minimum value of y of this class
        double yMinC = getY() + .5 * padding * getHeight();

        //calculation of the maximum value of x of this class
        double xMaxC = getX() + (1 - .5 * padding) * getWidth();

        //calculation of the maximum value of x of this class
        double yMaxC = getY() + (1 - .5 * padding) * getHeight();

        //calculation of the minimum value of x of GameEntity
        double xMinE = gameEntity.getX() + .5 * padding * gameEntity.getWidth();

        //calculation of the minimum value of y of GameEntity
        double yMinE = gameEntity.getY() + .5 * padding * gameEntity.getHeight();

        //calculation of the maximum value of x of GameEntity
        double xMaxE = gameEntity.getX() + (1 - .5 * padding) * gameEntity.getWidth();

        //calculation of the maximum value of x of GameEntity
        double yMaxE = gameEntity.getY() + (1 - .5 * padding) * gameEntity.getHeight();

        //cases that the squares doesn't collide

        //case 1: if the character rectangle is above enemy rectangle
        boolean isAbove = yMinC > yMaxE;

        //case 2: if the character rectangle is bellow enemy rectangle
        boolean isBelow = yMaxC < yMinE;

        //case 3: if the character rectangle is right enemy rectangle
        boolean isRight = xMinC > xMaxE;

        //case 3: if the character rectangle is left enemy rectangle
        boolean isLeft = xMaxC < xMinE;

        //there is a collision if none of the above is true

        return !(isAbove || isBelow || isRight || isLeft);

    }
}




