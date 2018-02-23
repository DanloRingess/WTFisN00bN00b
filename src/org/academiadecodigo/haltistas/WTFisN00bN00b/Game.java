package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;



public class Game {

    private Canvas background;

    private Menu menu;
    private GameMode gameMode;
    private Text score, stage;

    private Enemy[] enemy;

    private Enemy activeEnemy;

    private Character n00bn00b;

    private Controller controller;

    private int tickCounter;
    private int cycleCounter;
    private boolean gameOver;

    private int delay;

    public Game() {
        this.score = new Text(1150, 61, "");
        this.score.grow(20, 20);
        this.stage = new Text(230, 64, "");
        this.stage.grow(15, 22);

    }

    public void gameInit() throws InterruptedException {

        menu = new Menu(new Canvas(10, 10, "assets/main_menu.png"));

        gameMode = menu.play();

        n00bn00b = new Character();

        controller = new Controller(n00bn00b, this);
        controller.keyboardInitGame();

        if (gameMode == GameMode.QUIT) {
            System.exit(0);
        }

        if (gameMode == GameMode.START) {
            start();
        }
    }

    public void endGame() throws InterruptedException {

        //menu = new Menu(new Canvas(10, 10, "assets/worldenders_cave.jpeg"));

        if (gameMode == GameMode.QUIT) {
            System.exit(0);
        }

        if (gameMode == GameMode.START) {
            gameInit();
        }

        gameOver=false;
    }


    private void start() throws InterruptedException {

        background = new Canvas(10, 10, "assets/background.png");
        generateEnemies();
        n00bn00b.show();
        tickCounter = 0;                  // number of times while loop runs
        delay = 16;

        while (!gameOver) {

            Thread.sleep(delay);

            checkEnemyCycle();

            activeEnemy.move();

            n00bn00b.move();

            actionWhenCollides();

            tickCounter++;
            cycleCounter = tickCounter / 150; // number of game cycles (150 ticks per cycle)

            scoreboard();

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

    private void checkEnemyCycle() {
        if (tickCounter % 150 == 0) {

            selectActiveEnemy();
        }
    }

    private void actionWhenCollides() throws InterruptedException {
        if (collides(n00bn00b, activeEnemy)) {
            //Action TODO
            gameOver = true;
            System.out.println(tickCounter);
            endGame();
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
                activeEnemy = enemy[4];
                activeEnemy.moveBack(activeEnemy.getX());
                break;

            case 5:
                activeEnemy = enemy[3];
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

    public void scoreboard() {

        int level = (cycleCounter / 10) + 1;

        score.setText("" + tickCounter / 5);
        score.setColor(Color.WHITE);
        score.draw();

        stage.setText("" + level);
        stage.setColor(Color.WHITE);
        stage.draw();

    }

    public static boolean collides(Character n00bn00b, Enemy enemy) {
        return n00bn00b.collides(enemy);
    }

}


