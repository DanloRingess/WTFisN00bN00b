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

    private int delay;

    public void init() {

        GameCanvas canvas = new GameCanvas();

        generateEnemies();

        n00bn00b = new Character();
        n00bn00b.show();

        controller = new Controller(n00bn00b);

        controller.keyboardInit();

        tickCounter = 0;                  // number of times while loop runs

        delay = 15;
    }

    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(delay);

            checkEnemyCycle();

            activeEnemy.move();

            n00bn00b.move();

            tickCounter++;
            cycleCounter = tickCounter / 165; // number of game cycles (150 ticks per cycle)

            System.out.println(tickCounter);
            System.out.println(cycleCounter);
        }
    }

    private void generateEnemies() {

        enemy = new Enemy[]{
                new Supernova(),
                new CrocuBot(),
                new MillionAnts(),
                new VinceMaximus(),
                new AlanRails()
        };
    }

    private void checkEnemyCycle() {
        if (tickCounter % 165 == 0) {

            selectActiveEnemy();
        }
    }

    private void selectActiveEnemy() {

        switch (cycleCounter % 10) {
            case 0:
                activeEnemy = enemy[0];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 1:
                activeEnemy = enemy[1];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 2:
                activeEnemy = enemy[2];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 3:
                activeEnemy = enemy[3];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 4:
                activeEnemy = enemy[0];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 5:
                activeEnemy = enemy[1];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 6:
                activeEnemy = enemy[2];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 7:
                activeEnemy = enemy[3];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 8:
                activeEnemy = enemy[0];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 9:
                activeEnemy = enemy[1];
                activeEnemy.moveBack(activeEnemy.getX());

                if (delay > 1) {

                    delay -= 1;
                }

                break;
        }
    }
}


