package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies.*;


public class Game {


    private Enemy[] enemy;

    private Enemy activeEnemy;

    private Character n00bn00b;

    private Controller controller;

    private int tickCounter;
    private int cycleCounter;


    public void start() throws InterruptedException {

        GameCanvas canvas = new GameCanvas();

        enemy = new Enemy[] {
                new Supernova(),
                new CrocuBot(),
                new MillionAnts(),
                new VinceMaximus(),
                new AlanRails()
        };

        n00bn00b = new Character();
        n00bn00b.show();

        controller = new Controller(n00bn00b);

        controller.keyboardInit();

        tickCounter = 0;                  // number of times while loop runs

        while (true) {

            Thread.sleep(25);

            if (tickCounter % 150 == 0) {
                switch (cycleCounter % 10) {
                    case 1:
                        activeEnemy = enemy[0];
                        break;

                    case 2:
                        activeEnemy = enemy[0];
                        break;

                    case 3:
                        activeEnemy = enemy[0];
                        break;

                    case 4:
                        activeEnemy = enemy[0];
                        break;

                    case 5:
                        activeEnemy = enemy[0];
                        break;

                    case 6:
                        activeEnemy = enemy[0];
                        break;

                    case 7:
                        activeEnemy = enemy[0];
                        break;

                    case 8:
                        activeEnemy = enemy[0];
                        break;

                    case 9:
                        activeEnemy = enemy[0];
                        break;

                    case 0:
                        activeEnemy = enemy[0];
                        break;
                }
            }

            activeEnemy.move();

            n00bn00b.move();

            tickCounter++;
            cycleCounter = tickCounter / 150; // number of game cycles (150 ticks per cycle)

            if (activeEnemy.getX() == activeEnemy.getFinalX()) {

                activeEnemy.moveBack(activeEnemy.getX());
            }

            System.out.println(tickCounter);
            System.out.println(cycleCounter);
        }
    }
}

