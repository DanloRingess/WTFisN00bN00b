package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies.Enemy;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies.Supernova;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.Keyboard.Keyboard;


public class Game {

    private Scoreboard scoreboard;

    private Keyboard keyboard;

    private GameEntity[] gameEntities;

    private CollisionDetector collisionDetector;

    private Supernova enemy;

    private Character n00bn00b;

    public Game() {
    }

    public void start() throws InterruptedException {

        GameCanvas canvas = new GameCanvas();

        enemy = new Supernova();
        enemy.show();

        n00bn00b = new Character();
        n00bn00b.show();


        while (true) {

            Thread.sleep(20);

            enemy.move();

            if (n00bn00b.getY() > 101 && !n00bn00b.isGoingUp()) {

                n00bn00b.setDirY(-5);
                n00bn00b.move();

                if (n00bn00b.getY() == 100) {
                    n00bn00b.setGoingUp(true);
                }
            }

            if (n00bn00b.getY() < 351 && n00bn00b.isGoingUp()) {

                n00bn00b.setDirY(5);
                n00bn00b.move();

                if (n00bn00b.getY() == 350) {
                    n00bn00b.setGoingUp(false);
                }
            }

            if (enemy.getX() < -600) {

                int lastX = enemy.getX();

                enemy.hide();
                enemy.moveBack(lastX);
                enemy.show();
            }
        }
    }
}
