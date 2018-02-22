package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EnvironmentObject extends GameEntity {

    private Picture environmentObject;
    private int initialX = 550;
    private int finalY = 10;

    private int X;
    private int Y;

    private int dirX = -2;

    public EnvironmentObject() {

        environmentObject = new Picture(initialX, finalY, "assets/TV.png");


    }

    public void selectActiveNoCollibleObject() {

        if (getX() < -600) {
            moveBack(getX());
        }
    }


    public void moveBack(int lastX) {

        environmentObject.translate(initialX - lastX, 0);
        this.X = initialX;
    }


    public void show() {

        environmentObject.draw();
    }


    public void move() {

        environmentObject.translate(dirX, 0);
        this.X += dirX;
        environmentObject.draw();
    }


    public int getX() {
        return X;
    }

}



