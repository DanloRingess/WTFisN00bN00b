package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu {


    private GamePlace gamePlace;
    private Canvas image;




    public Menu() {
        new MenuController();
        image = new Canvas(10, 10, "assets/n00b.jpg");
        gamePlace = GamePlace.MENU;
    }

    public GamePlace play() throws InterruptedException {

        image.show();

        while (gamePlace == GamePlace.MENU) {
            Thread.sleep(50);
        }

        image.hide();
        return gamePlace;
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

            KeyboardEvent newGame = new KeyboardEvent();
            newGame.setKey(KeyboardEvent.KEY_N);
            newGame.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(newGame);
        }

        @Override
        public void keyPressed(KeyboardEvent e) {

            switch (e.getKey()) {
                case KeyboardEvent.KEY_S:
                    gamePlace = GamePlace.START;
                    break;
                case KeyboardEvent.KEY_N:
                    gamePlace = GamePlace.ENDGAME;
                    break;
                case KeyboardEvent.KEY_X:
                    gamePlace = GamePlace.QUIT;
                    break;
                default:
                    System.err.println("JVM isn't working");
            }
        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {
        }
    }



}
