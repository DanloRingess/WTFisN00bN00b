package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class AlanRails extends Enemy {

    public AlanRails()  {
        super(new Picture(xPositionCalibrator,400,"assets/Alan.png"),new Picture(xPositionCalibrator,400,"assets/Alan_2.png"),950,400);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void moveBack(int lastX) {
        super.moveBack(lastX);
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return finalY;
    }

    @Override
    public int getWidth() {
        return enemySprite.getWidth();
    }

    @Override
    public int getHeight() {
        return enemySprite.getHeight();
    }

}
