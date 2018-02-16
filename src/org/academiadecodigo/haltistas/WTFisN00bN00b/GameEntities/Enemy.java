package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities;

import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends GameEntity implements Collidable {

    private Picture enemyPic;

    public Enemy() {

        enemyPic = new Picture(900, 500, "assets/supernova.png");
        enemyPic.grow(-200,-100);
    }

    @Override
    void show() {

    }

    @Override
    void hide() {

    }

    @Override
    public void draw() {

        enemyPic.draw();

    }
}
