package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;

public abstract class GameEntity  implements Collidable {

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

    @Override
    public boolean collides(GameEntity gameEntity) {
        return !(getY() > gameEntity.getY() + gameEntity.getHeight() ||
                gameEntity.getY() > getY() + getHeight() ||
                getX() > gameEntity.getX() + gameEntity.getWidth() ||
                gameEntity.getX() > getX() + getWidth());
    }
}
