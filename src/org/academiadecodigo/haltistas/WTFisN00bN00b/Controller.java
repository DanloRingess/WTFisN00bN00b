package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.Character;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class Controller implements KeyboardHandler {

    private Character character;
    private Game game;


    public Controller(Character character, Game game) {
        this.character = character;
        this.game = game;

    }

    public void keyboardInitGame() {

        Keyboard k = new Keyboard(this);

        KeyboardEvent jump = new KeyboardEvent();
        jump.setKey(KeyboardEvent.KEY_SPACE);
        jump.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(jump);

        new KeyboardEvent();
        KeyboardEvent crouch;
        crouch = new KeyboardEvent();
        crouch.setKey(KeyboardEvent.KEY_DOWN);
        crouch.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(crouch);
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
            default:
                System.out.println("JVM isn't working");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent e) {
    }
}
