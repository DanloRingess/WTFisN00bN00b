package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class Menu {

    private GameMode gameMode;
    private Canvas image;

    public Menu(Canvas image) {
        new MenuController();

        this.image = image;
        this.gameMode = GameMode.MENU;
    }


    public GameMode play() throws InterruptedException {

        image.show();

        while (gameMode == GameMode.MENU) {
            Thread.sleep(50);
        }

        image.hide();
        return gameMode;
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

       }

        @Override
        public void keyPressed(KeyboardEvent e) {

            switch (e.getKey()) {
                case KeyboardEvent.KEY_S:
                    gameMode = GameMode.START;
                    break;
               case KeyboardEvent.KEY_X:
                    gameMode = GameMode.QUIT;
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
