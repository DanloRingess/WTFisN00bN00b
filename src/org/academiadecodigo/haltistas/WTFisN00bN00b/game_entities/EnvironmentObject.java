package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EnvironmentObject extends GameEntity {

    private Picture environmentObject;
    private int initialX = 1050;

    private int X;

    private int dirX = -2;

    public EnvironmentObject() {

        environmentObject = new Picture(initialX, 10, "assets/TV.png");
    }

    public void moveBack(int lastX) {

        if (X < -600) {
        environmentObject.translate(initialX - lastX, 0);
        this.X = initialX;
        }
    }

    public void show() {

        environmentObject.draw();
    }

    public void move() {

        environmentObject.translate(dirX, 0);
        this.X += dirX;
    }

    public int getX() {
        return X;
    }
}



