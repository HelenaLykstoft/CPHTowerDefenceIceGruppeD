package com.company.enemy;

public interface Enemy {

    public void moveEnemy();
    public void showEnemy();
    public void deathOfEnemy();
    public int checkIfEnemyIsInBase(int basex, int basey);
}
