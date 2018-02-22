package org.academiadecodigo.haltistas.WTFisN00bN00b.interfaces;

public interface Collidable {

    boolean collides(Collidable gameEntity);

    int getX();

    int getY();

    int getWidth();

    int getHeight();

}
