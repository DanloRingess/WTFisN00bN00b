package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameCanvas {

    private Picture background;

    public GameCanvas() {
        this.background = new Picture(10,10, "assets/background.png");
        background.draw();
    }
}
