package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Character extends GameEntity implements Collidable {

    private Picture characterSprite;

    private int intialX = 100;
    private int initialY = 100;

    private int X;
    private int Y;

    public Character() {

        characterSprite = new Picture(intialX,initialY,"assets/n00b_haltista.png");
        characterSprite.grow(-30,-50);


    }

    public void jump() {

    }

    @Override
    void draw() {

        characterSprite.draw();

    }
}
