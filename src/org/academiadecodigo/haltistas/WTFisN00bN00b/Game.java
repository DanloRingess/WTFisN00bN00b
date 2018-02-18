package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies.*;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;


public class Game {

    private Enemy[] enemy;

    private Character n00bn00b;

    private Controller controller;


    public Game() {
    }

    public void start() throws InterruptedException {

        GameCanvas canvas = new GameCanvas();

        enemy = new Enemy[] {
                new Supernova(),
                new CrocuBot(),
                new MillionAnts(),
                new VinceMaximus(),
                new AlanRails()
        };

        enemy[0].show();

        n00bn00b = new Character();
        n00bn00b.show();

        controller = new Controller(n00bn00b);

        controller.keyboardInit();

        while (true) {

            Thread.sleep(20);

            enemy[0].move();

            n00bn00b.move();

            if (enemy[0].getX() < -600) {

                int lastX = enemy[0].getX();

                enemy[0].hide();
                enemy[0].moveBack(lastX);
                enemy[0].show();
            }
        }
    }
}

