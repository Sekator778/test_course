package ru.parsentev.task_018;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import java.util.*;

import static org.slf4j.LoggerFactory.getLogger;

public class Pool {
    private static final Logger LOGGER = getLogger(Pool.class);
    private int[][] values;
    private int[] point;

    public Pool(final int[][] values) {
        this.values = values;
        this.point = new int[values.length * values[0].length];
    }

    public int maxUnion() {
        int count = 1;
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                if (values[i][j] == 1) {
                    points.add(new Point(i, j));
                }
            }
        }
        for (int i = 0; i < points.size() - 1; i++
             ) {
            int k = i;
            k = ++k;
            int x = points.get(i).getX();
            int y = points.get(i).getY();
            int xNext = points.get(k).getX();
            int yNext = points.get(k).getY();
            int sumBefore = x + y;
            int sumAfter = xNext + yNext;

            if ((sumBefore == sumAfter)) {
                count++;
                continue;
            }
            if (sumAfter == (sumBefore + 1)) {
                count++;
                continue;
            }
            if ((sumAfter + 1) == sumBefore) {
                count++;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        Pool pool = new Pool(
//                new int[][]{
//                        {1, 1, 1},
//                        {1, 1, 1},
//                        {1, 1, 1}
//                }
//        );
//        int points = pool.maxUnion();
//        System.out.println(points);
//    }

}
