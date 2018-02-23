package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Supernova extends Enemy {

    public Supernova() {
        super(new Picture(positionCalibrator, 410, "assets/Supernova.png"), new Picture(positionCalibrator, 410, "assets/Supernova_2.png"), 1050, 410);
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

