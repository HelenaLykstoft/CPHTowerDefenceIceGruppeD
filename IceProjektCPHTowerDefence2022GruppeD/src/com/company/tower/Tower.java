package com.company.tower;

import com.company.enemy.Enemy;

public interface Tower {

    public void towerPosition();
    public void ifEnemyNearby();
    public void shootEnemy(Enemy e);
    public void setDmg(int damage);
}
