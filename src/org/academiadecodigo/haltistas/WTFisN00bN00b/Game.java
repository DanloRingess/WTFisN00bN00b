package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Game implements MouseHandler{

    private Mouse m;


    private Canvas background;

    private Menu menu;
    private GamePlace gamePlace;
    private Text score, stage;

    private Enemy[] enemy;

    private Enemy activeEnemy;

    private Character n00bn00b;

    private Controller controller;

    private int tickCounter;
    private int cycleCounter;

    private int delay;

    public Game() {
        menu = new Menu();
        this.score = new Text(1100, 30, "");
        this.stage = new Text(100, 30, "");

        Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);
        m.addEventListener(MouseEventType.MOUSE_MOVED);
    }

    public void mainMenu() {

        background = new Canvas(10, 10, "assets/n00b.jpg");


    }

    public void gameInit() throws InterruptedException {

        gamePlace = GamePlace.MENU;
        gamePlace = menu.play();

        background = new Canvas(10, 10, "assets/worldenders_cave.jpeg");

        System.out.println("i'll bite");
        //background.setBackground(10, 10, "assets/worldenders_cave.jpeg");

        generateEnemies();

        n00bn00b = new Character();
        n00bn00b.show();

        controller = new Controller(n00bn00b, this);
        controller.keyboardInitGame();

        if (gamePlace == GamePlace.QUIT) {
            System.exit(0);
        }
        if (gamePlace == GamePlace.ENDGAME) {
            gameInit();
        }

        if (gamePlace == GamePlace.START) {
            start();
        }
        //start();

    }

    private void start() throws InterruptedException {

        tickCounter = 0;                  // number of times while loop runs
        delay = 15;

        while (true) {

            Thread.sleep(delay);

            checkEnemyCycle();

            activeEnemy.move();

            n00bn00b.move();

            tickCounter++;
            cycleCounter = tickCounter / 165; // number of game cycles (150 ticks per cycle)

            scoreboard();

            //System.out.println(tickCounter);
            //System.out.println(cycleCounter);
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
        }
    }

    public void scoreboard() {

        int Stage = (cycleCounter / 10) + 1;

        // this.text = new Text(1000,300,"score:   " + tickCounter);
        score.delete();
        score.setText("SCORE:      " + tickCounter / 5);
        score.draw();
        //text.grow(100, 100);
        score.setColor(Color.WHITE);
        score.draw();

        stage.delete();
        stage.setText("LEVEL: " + Stage);
        stage.draw();
        //text.grow(100, 100);
        stage.setColor(Color.WHITE);
        stage.draw();


    }



    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        System.out.println(e);

    }
}


