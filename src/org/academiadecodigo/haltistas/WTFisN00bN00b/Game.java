package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
<<<<<<< HEAD
=======

>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3


public class Game {

<<<<<<< HEAD
    private Menu image;
    private GamePlace gamePlace;
=======
    private Canvas background;

    private Menu menu;
    private GameMode gameMode;
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3
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
<<<<<<< HEAD
=======
        this.score = new Text(1150, 61, "");
        this.score.grow(20, 20);
        this.stage = new Text(230, 64, "");
        this.stage.grow(15, 22);

    }

    public void gameInit() throws InterruptedException {

        menu = new Menu(new Canvas(10, 10, "assets/main_menu.png"));

        gameMode = menu.play();
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3

        this.image = new Menu();
        n00bn00b = new Character();
        controller = new Controller(n00bn00b, this);
        controller.keyboardInitGame();
    }

    public void gameInit() throws InterruptedException {

<<<<<<< HEAD
        gamePlace = image.play();
        if (gamePlace == GamePlace.QUIT) {
            System.exit(0);
        }
        if (gamePlace == GamePlace.START) {
=======
        if (gameMode == GameMode.QUIT) {
            System.exit(0);
        }

        if (gameMode == GameMode.START) {
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3
            start();
        }
    }

    public void endGame() throws InterruptedException {

        image.showGameOver();

<<<<<<< HEAD
        while (gameOver) {

            if (image.getGamePlace() == GamePlace.ENDGAME) {
                gameOver = false;
                gameInit();
            }
=======
        if (gameMode == GameMode.QUIT) {
            System.exit(0);
        }

        if (gameMode == GameMode.START) {
            gameInit();
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3
        }
    }

    private void start() throws InterruptedException {

        this.score = new Text(1150, 61, "");
        this.score.grow(20, 20);
        this.stage = new Text(230, 64, "");
        this.stage.grow(15, 22);

        image.showBackground();
        generateEnemies();
        n00bn00b.show();
        tickCounter = 0;                  // number of times while loop runs
        delay = 15;

        while (!gameOver) {
            Thread.sleep(delay);
            checkEnemyCycle();
            activeEnemy.move();
            n00bn00b.move();
            actionWhenCollides();
            tickCounter++;
            cycleCounter = tickCounter / 165; // number of game cycles (150 ticks per cycle)
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
        if (tickCounter % 165 == 0) {
            selectActiveEnemy();
        }
    }

    private void actionWhenCollides() throws InterruptedException {
        if (collides(n00bn00b, activeEnemy)) {
            //Action TODO
            gameOver = true;
            System.out.println(tickCounter);
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

                if (delay > 1) {

                    delay -= 1;
                }
        }
    }

    public void scoreboard() {

        int level = (cycleCounter / 10) + 1;
        score.delete();
        score.setText("" + tickCounter / 5);
        score.setColor(Color.WHITE);
        score.draw();

        stage.delete();
        stage.setText("" + level);
        stage.setColor(Color.WHITE);
        stage.draw();

    }

    public static boolean collides(Character n00bn00b, Enemy enemy) {
        return n00bn00b.collides(enemy);
    }

}


