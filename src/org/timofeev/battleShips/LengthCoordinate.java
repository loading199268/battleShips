package org.timofeev.battleShips;

import java.util.ArrayList;
import java.util.List;

public class LengthCoordinate {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int length;


    public LengthCoordinate(String str) throws Exception {
        String[] result = str.split(" ");
        int[] x1y1 = build(result[0]);
        int[] x2y2 = build(result[1]);
        this.x1 = Math.min(x1y1[0], x2y2[0]);
        this.x2 = Math.max(x2y2[0], x1y1[0]);
        this.y1 = Math.min(x1y1[1], x2y2[1]);
        this.y2 = Math.max(x2y2[1], x1y1[1]);

        if (!(x1 == x2 || y1 == y2)) {
            throw new IllegalStateException("Error! Wrong ship location! Try again:");
        }
        if (x1 == x2) {
            this.length = Math.abs(y1 - y2) + 1;
        } else {
            this.length = Math.abs(x1 - x2) + 1;
        }
    }

    public List<SimpleCoordinate> asSimpleCoordinates() {
        List<SimpleCoordinate> list = new ArrayList<>();
        if (x1 == x2) {
            for (int i = 0; i < length; i++) {
                list.add(new SimpleCoordinate(x1, y1 + i));
            }
        }
        if (y1 == y2) {
            for (int i = 0; i < length; i++) {
                list.add(new SimpleCoordinate(x1 + i, y1));
            }
        }
        return list;
    }

    public int getLength() {
        return length;
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

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }


    public static class SimpleCoordinate {
        private final int x;
        private final int y;

        private SimpleCoordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
