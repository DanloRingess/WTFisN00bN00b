package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Menu {

<<<<<<< HEAD
    private GamePlace gamePlace;
    private Picture imageBackgroung, imageMainMenu, imageGameover;
=======
    private GameMode gameMode;
    private Canvas image;
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3

    public Menu() {
        new MenuController();
<<<<<<< HEAD
        this.imageBackgroung = new Picture(10, 10, "assets/background.png");
        this.imageMainMenu = new Picture(10, 10, "assets/main_menu.png");
        this.imageGameover = new Picture(10, 10, "assets/worldenders_cave.jpeg");
        this.gamePlace = GamePlace.MENU;

=======

        this.image = image;
        this.gameMode = GameMode.MENU;
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3
    }


    public GameMode play() throws InterruptedException {

        showMainMenu();

        while (gameMode == GameMode.MENU) {
            Thread.sleep(50);
        }

<<<<<<< HEAD
        imageMainMenu.delete();
        return gamePlace;
=======
        image.hide();
        return gameMode;
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3
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

<<<<<<< HEAD
            KeyboardEvent NewGame = new KeyboardEvent();
            NewGame.setKey(KeyboardEvent.KEY_N);
            NewGame.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(NewGame);
        }
=======
       }
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3

        @Override
        public void keyPressed(KeyboardEvent e) {

            System.out.println(e.getKeyboardEventType());
            switch (e.getKey()) {
                case KeyboardEvent.KEY_S:
<<<<<<< HEAD
                    gamePlace = GamePlace.START;
                    break;
                case KeyboardEvent.KEY_X:
                    gamePlace = GamePlace.QUIT;
=======
                    gameMode = GameMode.START;
                    break;
               case KeyboardEvent.KEY_X:
                    gameMode = GameMode.QUIT;
>>>>>>> a042b9437041fe2f0a6a34d2a38abcc883bd97a3
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
