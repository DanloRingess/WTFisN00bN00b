package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Character;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {

    private Character character;
    private Game game;

    public Controller(Character character) {
        this.character = character;
    }

    public void keyboardInit() {

        Keyboard k = new Keyboard(this);

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

        event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_DOWN);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

        event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_S);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);
    }


    @Override
    public void keyPressed(KeyboardEvent e) {

        switch (e.getKey()) {

            case KeyboardEvent.KEY_SPACE:
                character.jump();
                break;

            case KeyboardEvent.KEY_DOWN:
                character.crouch();
                break;

            case KeyboardEvent.KEY_S:
                try {
                    game.start();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                break;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent e) {


    }
}
