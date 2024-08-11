package org.timofeev.battleShips.ships;

import org.timofeev.battleShips.Ship;

public class Cruiser extends Ship {
    static int hp = 3;

    public Cruiser() {
        super(hp);
    }

    @Override
    public int minusHp() {
        return --hp;
    }

    @Override
    public String getName() {
        return "Cruiser";
    }

    @Override
    public Ship getInstance() {
        return new Cruiser();
    }
}
