package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemy;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.Keyboard.Keyboard;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Scoreboard scoreboard;

    private Keyboard keyboard;

    private GameEntity[] gameEntities;

    private CollisionDetector collisionDetector;

    public Game() {
    }

    public void start() {

        GameCanvas canvas = new GameCanvas();

        Enemy enemy = new Enemy();
        enemy.draw();
        enemy.hide();
        enemy.draw();


    }
}
