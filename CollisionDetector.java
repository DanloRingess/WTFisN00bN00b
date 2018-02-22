package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Character;
import org.academiadecodigo.haltistas.WTFisN00bN00b.GameEntities.Enemies.Enemy;

public class CollisionDetector {


	
	/**
	 * Find if Character collides with enemy
	 *
	 * @param n00bn00b
	 * @param enemy
	 */
	public static boolean collides(Character n00bn00b, Enemy enemy) {
		return n00bn00b.collides(enemy);
	}
	
	
}
