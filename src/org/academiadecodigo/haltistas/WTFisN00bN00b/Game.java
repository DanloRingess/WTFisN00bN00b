package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies.Supernova;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;


public class Game {

    private Scoreboard scoreboard;

    private GameEntity[] gameEntities;

    private Supernova enemy;

    private Character n00bn00b;

    private Controller controller;


    public Game() {
    }

    public void start() throws InterruptedException {

        GameCanvas canvas = new GameCanvas();

        enemy = new Supernova();
        enemy.show();

        n00bn00b = new Character();
        n00bn00b.show();

        controller = new Controller(n00bn00b);

        controller.keyboardInit();

        while (true) {

            Thread.sleep(20);

            enemy.move();

            n00bn00b.move();

            if (enemy.getX() < -600) {

                int lastX = enemy.getX();

                enemy.hide();
                enemy.moveBack(lastX);
                enemy.show();
            }
        }
    }
}

