package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies.ObjectsNonCollidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EnvironmentObject extends GameEntity {

    private Picture environmentObject;
    private int initialX = 1000;
    private int initialY = 400;

    private int finalX = -600;
    private int finalY = 400;

    //private Picture alanSprite = new Picture(10,10, "assets/Alan.png");

    private int X;
    private int Y;

    private int dirX = -10;

    public EnvironmentObject() {

        environmentObject = new Picture();

    }


    public Picture getEnvironmentObject() {

        int random = (int) (Math.random() * ObjectsNonCollidable.values().length);

        ObjectsNonCollidable objectsNonCollidable = ObjectsNonCollidable.values()[random];

        Picture environmentObject = null;

        switch (objectsNonCollidable) {

            case BROOM:
                environmentObject = new Picture(10, 10, "assets/broom.png");
                environmentObject.draw();
                break;
            case TV:
                environmentObject = new Picture(10, 10, "assets/TV.png");
                environmentObject.draw();
                break;
            case FLOOR:
                environmentObject = new Picture(10, 10, "assets/floor.png");
                environmentObject.draw();
                break;
            case WINDOW:
                environmentObject = new Picture(10, 10, "assets/window.png");
                environmentObject.draw();
                break;
            default:
                System.out.println("JVM deu merda");
        }
        return environmentObject;
    }


    public void moveBack(int lastX) {
        environmentObject.translate(initialX - lastX, 0);
        this.X = initialX;
    }

    @Override
    public void show() {
        environmentObject.draw();
    }

    @Override
    public void move() {

        environmentObject.translate(dirX, 0);
        this.X += dirX;
    }


    public int getX() {
        return X;
    }


    public int getY() {
        return Y;
    }


    public int getWidth() {
        return environmentObject.getWidth();
    }


    public int getHeight() {
        return environmentObject.getHeight();
    }

}



