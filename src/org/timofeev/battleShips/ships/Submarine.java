package org.timofeev.battleShips.ships;

import org.timofeev.battleShips.Ship;

public class Submarine extends Ship {
    static int hp = 3;

    public Submarine() {
        super(hp);
    }

    @Override
    public int minusHp() {
        return --hp;
    }

    @Override
    public String getName() {
        return "Submarine";
    }

    @Override
    public Ship getInstance() {
        return new Submarine();
    }
}
