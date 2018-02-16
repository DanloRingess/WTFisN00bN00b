package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemy;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.Keyboard.Keyboard;


public class Game {

    private Scoreboard scoreboard;

    private Keyboard keyboard;

    private GameEntity[] gameEntities;

    private CollisionDetector collisionDetector;

    private Enemy enemy;

    private Character n00bn00b;

    public Game() {
    }

    public void start() throws InterruptedException {

        GameCanvas canvas = new GameCanvas();

        enemy = new Enemy();
        enemy.draw();

        n00bn00b = new Character();
        n00bn00b.draw();


        while (true) {

            Thread.sleep(20);

            enemy.move();

            if (enemy.getX() < -600) {

                int lastX = enemy.getX();

                enemy.hide();
                enemy.move(lastX);
                enemy.draw();
            }
        }
    }
}
