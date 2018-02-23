package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.EnvironmentObject;
import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Game {

    private Menu menu;
    private GameMode gameMode;
    private Enemy[] enemy;
    private Enemy activeEnemy;
    private Character n00bn00b;
    private Controller controller;
    private EnvironmentObject environmentObject;
    private Scoreboard scoreboard;

    private int cycleCounter;
    private int tickCounter;
    private int delay;

    private boolean gameOver;

    public Game() {
        this.menu = new Menu();
        this.n00bn00b = new Character();
        this.controller = new Controller(n00bn00b, this);
        this.environmentObject = new EnvironmentObject();
    }


    public void gameInit() throws InterruptedException {

        gameMode = menu.play();

        controller.keyboardInitGame();

        if (gameMode == GameMode.QUIT) {
            return;
        }

        if (gameMode == GameMode.START) {
            start();
        }
    }


    private void start() throws InterruptedException {

        scoreboard = new Scoreboard(this);

        menu.showBackground();

        generateEnemies();

        n00bn00b.show();

        tickCounter = 0;                  // number of times while loop runs

        delay = 16;

        while (!gameOver) {

            Thread.sleep(delay);

            checkCycle();

            activeEnemy.move();

            environmentObject.move();

            n00bn00b.move();

            actionWhenCollides();

            tickCounter++;

            cycleCounter = tickCounter / 165; // number of game cycles (150 ticks per cycle)

            scoreboard.show();
        }
    }

    private void generateEnemies() {

        enemy = new Enemy[]{

                new Supernova(),
                new CrocuBot(),
                new MillionAnts(),
                new VanceMaximus(),
                new AlanRails()
        };
    }

    private void checkCycle() {
        if (tickCounter % 165 == 0) {
            selectActiveEnemy();
            environmentObject.moveBack(environmentObject.getX());
        }
    }

    private void actionWhenCollides() {

        if (collides(n00bn00b, activeEnemy)) {
            gameOver = true;
            System.exit(0);
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

                if (delay > 4) {

                    delay -= 1;
                }
        }
    }


    private static boolean collides(Character n00bn00b, Enemy enemy) {
        return n00bn00b.collides(enemy);
    }

    public int getCycleCounter() {
        return cycleCounter;
    }

    public int getTickCounter() {
        return tickCounter;
    }
}


