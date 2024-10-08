package org.timofeev.battleShips.ships;

import org.timofeev.battleShips.Ship;

public class Destroyer extends Ship {
    static int hp = 2;

    public Destroyer() {
        super(hp);
    }

    @Override
    public int minusHp() {
        return --hp;
    }

    @Override
    public String getName() {
        return "Destroyer";
    }

    @Override
    public Ship getInstance() {
        return new Destroyer();
    }
}
