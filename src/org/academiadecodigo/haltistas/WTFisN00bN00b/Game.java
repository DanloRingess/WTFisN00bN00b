package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.Keyboard.Keyboard;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Scoreboard scoreboard;

    private Keyboard keyboard;

    private GameEntity[] gameEntities;

    private CollisionDetector collisionDetector;

    public Game() {
    }

    public void start() {

        Picture background = new Picture(10, 10, "assets/worldenders_cave.jpeg");
        background.draw();

    }
}
