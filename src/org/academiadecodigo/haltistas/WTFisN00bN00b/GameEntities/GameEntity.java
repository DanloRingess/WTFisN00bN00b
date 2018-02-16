package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

public abstract class GameEntity {

    public GameEntity() {
    }

    private int X;
    private  int Y;



    abstract void show();

    abstract void hide();

    abstract void move();

    abstract int getX();

    abstract int getY();

    abstract int getWidth();

    abstract int getHeight();

}
