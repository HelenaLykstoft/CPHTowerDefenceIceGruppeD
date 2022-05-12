package com.company.enemy;

public abstract class AEnemy implements Enemy {
    private int health;
    private int value;
    private int x;
    private int y;

    @Override
    public void moveEnemy() {

    }

    @Override
    public void showEnemy() {

    }

    @Override
    public void deathOfEnemy() {

    }

    @Override
    public int checkIfEnemyIsInBase(int basex, int basey) {
        if (x == basex && y == basey){
            return -1;
        }
        return 0;
    }
}
