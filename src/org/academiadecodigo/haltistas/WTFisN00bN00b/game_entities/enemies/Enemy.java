package org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.interfaces.Collidable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Enemy extends GameEntity implements Collidable {

    protected Picture enemySprite;
    protected Picture eSprite1;
    protected Picture eSprite2;

    protected static int speed = -10;
    protected static int positionCalibrator = 30;

    protected int finalY;
    protected int initialX;
    protected int X;

    protected boolean spriteState;


    public Enemy(Picture eSprite1, Picture eSprite2,int initialX,int finalY) {
        this.enemySprite = eSprite1;
        this.eSprite1 = eSprite1;
        this.eSprite2 = eSprite2;
        this.initialX = initialX;
        this.finalY = finalY;
    }

    @Override
    public void show() {

        enemySprite.draw();
    }

    @Override
    public void move() {

        eSprite1.translate(speed, 0);
        eSprite2.translate(speed, 0);
        this.X += speed;

        if (this.X % 200 == 0) {

            changeSprite();
        }
    }

    public void changeSprite() {

        if (spriteState) {
            enemySprite.delete();
            enemySprite = eSprite1;
            enemySprite.draw();

            spriteState = false;
            return;
        }

        enemySprite.delete();
        enemySprite =  eSprite2;
        enemySprite.draw();

        spriteState = true;
    }

    public void moveBack(int lastX) {

        eSprite1.translate(initialX - lastX, 0);
        eSprite2.translate(initialX - lastX, 0);
        this.X = initialX;
    }

    public boolean collides(Collidable gameEntity) {
        //the padding creates a sub rectangle that's smaller in percentage,
        //padding = 0 is the original rectangle
        // padding = 1 is a rectangle of area 0.

        double padding = .2;


        //calculation of the minimum value of x of this class
        double xMinC = getX() + .5 * padding * getWidth();

        //calculation of the minimum value of y of this class
        double yMinC = getY() + .5 * padding * getHeight();

        //calculation of the maximum value of x of this class
        double xMaxC = getX() + (1 - .5 * padding) * getWidth();

        //calculation of the maximum value of x of this class
        double yMaxC = getY() + (1 - .5 * padding) * getHeight();

        //calculation of the minimum value of x of GameEntity
        double xMinE = gameEntity.getX() + .5 * padding * gameEntity.getWidth();

        //calculation of the minimum value of y of GameEntity
        double yMinE = gameEntity.getY() + .5 * padding * gameEntity.getHeight();

        //calculation of the maximum value of x of GameEntity
        double xMaxE = gameEntity.getX() + (1 - .5 * padding) * gameEntity.getWidth();

        //calculation of the maximum value of x of GameEntity
        double yMaxE = gameEntity.getY() + (1 - .5 * padding) * gameEntity.getHeight();

        //cases that the squares doesn't collide

        //case 1: if the character rectangle is above enemy rectangle
        boolean isAbove = yMinC > yMaxE;

        //case 2: if the character rectangle is bellow enemy rectangle
        boolean isBelow = yMaxC < yMinE;

        //case 3: if the character rectangle is right enemy rectangle
        boolean isRight = xMinC > xMaxE;

        //case 3: if the character rectangle is left enemy rectangle
        boolean isLeft = xMaxC < xMinE;

        //there is a collision if none of the above is true

        return !(isAbove || isBelow || isRight || isLeft);


    }
}
