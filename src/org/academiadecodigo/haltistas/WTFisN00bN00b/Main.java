package org.academiadecodigo.haltistas.WTFisN00bN00b;

public class Main {

    public static void main(String[] args){

        Game game = new Game();


        try {
            game.gameInit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
