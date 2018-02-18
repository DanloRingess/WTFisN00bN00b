package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;

public abstract class Enemy extends GameEntity implements Collidable {

    private int initialX;
    private int initialY;

    private int finalX;
    private int finalY;

    abstract public void moveBack(int lastX);

    abstract public int getFinalX();
}
