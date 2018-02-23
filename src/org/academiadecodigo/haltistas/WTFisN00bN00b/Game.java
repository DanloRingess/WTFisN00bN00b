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
    private EntitySelector selector;

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

        selector = new EntitySelector(this);

        menu.showBackground();

        enemy = selector.generateEnemies();

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

    private void checkCycle() {
        if (tickCounter % 165 == 0) {
            selector.selectActiveEnemy();

            activeEnemy = selector.getActiveEnemy();

            environmentObject.moveBack(environmentObject.getX());
            activeEnemy.moveBack(activeEnemy.getX());
        }
    }

    private void actionWhenCollides() {
        if (collides(n00bn00b, activeEnemy)) {
            gameOver = true;
            System.exit(0);
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

    public void setDelay(int delayDecrement) {
        this.delay = this.delay - delayDecrement;
    }

    public int getDelay() {
        return delay;
    }
}


