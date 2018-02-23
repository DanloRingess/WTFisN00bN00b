package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MillionAnts extends Enemy {

    public MillionAnts() {
        super(new Picture(xPositionCalibrator, 400, "../assets/Million_ants.png"),new Picture(xPositionCalibrator, 400, "../assets/Million_ants_2.png"),1100,410);
    }

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
