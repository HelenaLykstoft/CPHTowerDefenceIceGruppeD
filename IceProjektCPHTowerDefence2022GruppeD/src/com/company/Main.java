package com.company;

import com.company.enemy.*;
import com.company.game.Game;
import com.company.tower.*;

public class Main {

    public static void main(String[] args) {
	//Game game = new Game();
    //game.runGame();
    Player player = new Player(5);
    //player.ifLifeLost();
        Enemy e = new legendaryEnemy(100);
        Tower t = new superTower();
        t.setDmg(100);
        t.shootEnemy(e);
    }
}
