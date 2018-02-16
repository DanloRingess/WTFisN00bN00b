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


        System.out.println("Hello NOOB NOOB");

        Picture pic = new Picture(20, 220, "http://static0.bigstockphoto.com/thumbs/3/5/2/small2/25346960.jpg");
        pic.draw();

    }
}
