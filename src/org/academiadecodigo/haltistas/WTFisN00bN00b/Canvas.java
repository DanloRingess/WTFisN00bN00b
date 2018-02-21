package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Canvas {

    private Picture menuScreen;

    private Picture background;

    public Canvas(int x, int y, String pic) {

        background = new Picture();

        this.menuScreen = new Picture(x, y, pic);
        this.menuScreen.draw();
    }

    public void setBackground(int x, int y, String pic) {

        System.out.println("2222222");

        this.background = new Picture(x,y,pic);
        this.background.draw();


    }

    public void show(){

        background.draw();

    }

    public void hide(){
        background.delete();
    }


}
