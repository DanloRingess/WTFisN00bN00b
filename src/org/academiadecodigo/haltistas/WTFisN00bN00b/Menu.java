package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Menu {

    private GamePlace gamePlace;
    private Picture imageBackgroung, imageMainMenu, imageGameover;

    public Menu() {
        new MenuController();
        this.imageBackgroung = new Picture(10, 10, "assets/background.png");
        this.imageMainMenu = new Picture(10, 10, "assets/main_menu.png");
        this.imageGameover = new Picture(10, 10, "assets/worldenders_cave.jpeg");
        this.gamePlace = GamePlace.MENU;

    }


    public GamePlace play() throws InterruptedException {

        showMainMenu();

        while (gamePlace == GamePlace.MENU) {
            Thread.sleep(50);
        }

        imageMainMenu.delete();
        return gamePlace;
    }

    public void showBackground() {
        imageBackgroung.draw();
        imageGameover.delete();
        imageMainMenu.delete();
    }

    public void showMainMenu() {
        imageMainMenu.draw();
        imageGameover.delete();
        imageBackgroung.delete();
    }

    public void showGameOver() {
        imageGameover.draw();
        imageBackgroung.delete();
        imageMainMenu.delete();
    }


    private class MenuController implements KeyboardHandler {

        private Keyboard k;

        public MenuController() {
            k = new Keyboard(this);
            keyboardInit();
        }

        private void keyboardInit() {

            KeyboardEvent Game = new KeyboardEvent();
            Game.setKey(KeyboardEvent.KEY_S);
            Game.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(Game);

            KeyboardEvent Quit = new KeyboardEvent();
            Quit.setKey(KeyboardEvent.KEY_X);
            Quit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(Quit);

            KeyboardEvent NewGame = new KeyboardEvent();
            NewGame.setKey(KeyboardEvent.KEY_N);
            NewGame.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(NewGame);
        }

        @Override
        public void keyPressed(KeyboardEvent e) {

            System.out.println(e.getKeyboardEventType());
            switch (e.getKey()) {
                case KeyboardEvent.KEY_S:
                    gamePlace = GamePlace.START;
                    break;
                case KeyboardEvent.KEY_X:
                    gamePlace = GamePlace.QUIT;
                    break;
                case KeyboardEvent.KEY_N:
                    gamePlace = GamePlace.ENDGAME;

                    break;
                default:
                    System.err.println("JVM isn't working");
            }
        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {
        }
    }

    public GamePlace getGamePlace() {
        return gamePlace;
    }


}
