package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.interfaces.Collidable;

public abstract class Enemy extends GameEntity {

    private int initialX;
    private int initialY;

    private int finalX;
    private int finalY;

    abstract public void moveBack(int lastX);

    abstract public int getFinalX();


}
