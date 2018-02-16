package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemy;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.Keyboard.Keyboard;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Scoreboard scoreboard;

    private Keyboard keyboard;

    private GameEntity[] gameEntities;

    private CollisionDetector collisionDetector;

    public Game() {
    }

    public void start() throws InterruptedException{

        GameCanvas canvas = new GameCanvas();

        Enemy enemy = new Enemy();
        enemy.draw();


        while (enemy.getX() > -200) {
            Thread.sleep(20);
            enemy.move();
        }

        enemy.hide();
        enemy.setX(900);
        enemy.draw();

    }
}
