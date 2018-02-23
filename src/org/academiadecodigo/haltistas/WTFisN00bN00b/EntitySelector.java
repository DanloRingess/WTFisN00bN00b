package org.academiadecodigo.haltistas.WTFisN00bN00b;

import org.academiadecodigo.haltistas.WTFisN00bN00b.game_entities.enemies.*;

public class EntitySelector {

    private Game game;

    private Enemy activeEnemy;

    private Enemy[] enemy = generateEnemies();

    EntitySelector(Game game) {
        this.game = game;
    }

    public Enemy[] generateEnemies() {

        return new Enemy[]{

                new Supernova(),
                new CrocuBot(),
                new MillionAnts(),
                new VanceMaximus(),
                new AlanRails()
        };
    }

    public void selectActiveEnemy() {

        switch (game.getCycleCounter() % 10) {
            case 0:
                activeEnemy = enemy[0];
                break;

            case 1:
                activeEnemy = enemy[1];
                break;

            case 2:
                activeEnemy = enemy[2];
                break;

            case 3:
                activeEnemy = enemy[3];
                break;

            case 4:
                activeEnemy = enemy[4];
                break;

            case 5:
                activeEnemy = enemy[0];
                break;

            case 6:
                activeEnemy = enemy[2];
                break;

            case 7:
                activeEnemy = enemy[3];
                break;

            case 8:
                activeEnemy = enemy[1];
                break;

            case 9:
                activeEnemy = enemy[4];

                if (game.getDelay() > 4) {

                    game.setDelay(1);
                }
        }
    }

    public Enemy getActiveEnemy() {
        return activeEnemy;
    }
}
