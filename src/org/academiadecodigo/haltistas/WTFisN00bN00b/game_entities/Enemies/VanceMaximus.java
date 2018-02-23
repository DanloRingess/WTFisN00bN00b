package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VanceMaximus extends Enemy {

    public VanceMaximus() {
        super(new Picture(positionCalibrator, 320, "assets/Vance_Maximus.png"),new Picture(positionCalibrator, 320, "assets/Vance_Maximus_2.png"),900,320);
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
