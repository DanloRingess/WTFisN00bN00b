package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

public abstract class GameEntity {

    public GameEntity() {
    }

    private int X;
    private  int Y;

    public abstract void show();

    public abstract void hide();

    public abstract void move();

    public abstract int getX();

    public abstract int getY();

    public abstract int getWidth();

    public abstract int getHeight();

}
