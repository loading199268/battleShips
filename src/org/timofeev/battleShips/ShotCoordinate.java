package org.timofeev.battleShips;

public class ShotCoordinate {
    private final int x1;
    private final int y1;

    public ShotCoordinate(String str) throws Exception {
        int[] x1y1 = build(str);
        this.x1 = x1y1[0];
        this.y1 = x1y1[1];
    }

    private int[] build(String str) {
        int a1 = str.charAt(0) - 'A';
        String b1 = str.substring(1);
        int s1 = Integer.parseInt(b1) - 1;

        if (!((a1 >= 0 && a1 <= 9) && (s1 >= 0 && s1 <= 9))) {
            throw new IllegalStateException("Error! You entered the wrong coordinates! Try again:");
        }
        return new int[]{a1 + 1, s1 + 1};
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
}
