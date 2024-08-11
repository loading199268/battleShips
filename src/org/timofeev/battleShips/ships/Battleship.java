package org.timofeev.battleShips.ships;

import org.timofeev.battleShips.Ship;

public class Battleship extends Ship {
    static int hp = 4;

    public Battleship() {
        super(hp);
    }

    @Override
    public int minusHp() {
        return --hp;
    }

    @Override
    public String getName() {
        return "Battleship";
    }

    @Override
    public Ship getInstance() {
        return new Battleship();
    }
}
