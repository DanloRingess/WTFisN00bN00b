package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrocuBot extends Enemy {

    public CrocuBot() {
        super(new Picture(xPositionCalibrator, 410, "../assets/crocubot.png"),new Picture(xPositionCalibrator, 410, "assets/Crocubot_2.png"),1000,410);
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
