package org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.GameEntity;
import org.academiadecodigo.haltistas.WTFisN00bN00b.Interfaces.Collidable;

public abstract class Enemy extends GameEntity implements Collidable {
	
	private int initialX;
	private int initialY;
	
	private int finalX;
	private int finalY;
	
	abstract public void moveBack(int lastX);
	
	abstract public int getFinalX();
	
	@Override
	public boolean collides(GameEntity gameEntity) {
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