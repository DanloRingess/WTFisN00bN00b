package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Menu {

    private Picture imageBackgroung, imageMainMenu, imageGameover;
    private GameMode gameMode;

    public Menu() {

        new MenuController();
        this.imageBackgroung = new Picture(10, 10, "assets/background.png");
        this.imageMainMenu = new Picture(10, 10, "assets/main_menu.png");
        this.imageGameover = new Picture(10, 10, "assets/worldenders_cave.jpeg");
        this.gameMode = GameMode.MENU;
    }


    public GameMode play() throws InterruptedException {

        showMainMenu();

        while (gameMode == GameMode.MENU) {
            Thread.sleep(50);
        }

        imageMainMenu.delete();

        return gameMode;
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

            System.out.println(e.getKeyboardEventType());
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
