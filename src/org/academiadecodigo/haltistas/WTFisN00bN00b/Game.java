package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.EnvironmentObject;
import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies.*;
import org.academiadecodigo.haltistas.WTFisN00bN00b.tools.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Game {

    private Menu menu;

    private Enemy activeEnemy;
    private Character n00bn00b;
    private EnvironmentObject television;

    private EntitySelector selector;
    private Controller controller;

    private int cycleCounter;
    private int tickCounter;
    private int delay;


    Game() {
        this.menu = new Menu();
        this.n00bn00b = new Character();
        this.controller = new Controller(n00bn00b, this);
        this.television = new EnvironmentObject();
    }


    public void gameInit() throws InterruptedException {

        GameMode gameMode;

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

        selector = new EntitySelector(this);

        menu.showBackground();

        n00bn00b.show();

        television.show();

        tickCounter = 0;                  // counts the number of times while loop runs

        delay = 16;

        gameLoop();
    }


    private void gameLoop() throws InterruptedException {

        Scoreboard scoreboard = new Scoreboard();

        while (true) {

            Thread.sleep(delay);

            checkCycle();

            activeEnemy.move();

            television.move();

            n00bn00b.move();

            actionWhenCollides();

            tickCounter++;

            cycleCounter = tickCounter / 165; // number of game cycles (165 ticks per cycle)

            scoreboard.show();
        }
    }


    private void checkCycle() {
        if (tickCounter % 165 == 0) {

            selector.selectActiveEnemy();

            activeEnemy = selector.getActiveEnemy();

            television.moveBack(television.getX());
            activeEnemy.moveBack(activeEnemy.getX());
        }
    }


    private void actionWhenCollides() {
        if (checkCollision(n00bn00b, activeEnemy)) {

            System.exit(0);
        }
    }


    private static boolean checkCollision(Character n00bn00b, Enemy enemy) {
        return n00bn00b.collides(enemy);
    }


    public int getCycleCounter() {
        return cycleCounter;
    }


    private int getTickCounter() {
        return tickCounter;
    }


    public void setDelay(int delayDecrement) {
        this.delay = this.delay - delayDecrement;
    }


    public int getDelay() {
        return delay;
    }


    public class Scoreboard {

        private Text score, stage;

        Scoreboard() {

            this.score = new Text(1150, 61, "");
            this.score.grow(20, 20);
            this.stage = new Text(230, 64, "");
            this.stage.grow(15, 22);
        }

        void show() {

            int level = (getCycleCounter() / 10) + 1;
            score.delete();
            score.setText("" + getTickCounter() / 5);
            score.setColor(Color.WHITE);
            score.draw();

            stage.delete();
            stage.setText("" + level);
            stage.setColor(Color.WHITE);
            stage.draw();

        }
    }

}


