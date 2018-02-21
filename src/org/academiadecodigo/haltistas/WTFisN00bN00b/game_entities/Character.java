package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character extends GameEntity implements Collidable {

    private Picture characterSprite;

    private boolean jumping;

    private int intialX = 80;
    private int initialY = 450;

    private int X;
    private int Y;

    private int dirY;

    public Character() {

        characterSprite = new Picture(intialX, initialY, "assets/n00b_haltista.png");
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
        dirY = 9;

    }
    public void crouch() {

        if (jumping) {
            dirY = 12;
        }

    }

    public int getIntialX() {
        return intialX;
    }

    public int getInitialY() {
        return initialY;
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

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }


}




