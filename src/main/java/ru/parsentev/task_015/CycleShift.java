package ru.parsentev.task_015;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * спешуууу тут шото накрутил с индексами
 * уже пол 4 утра надо поспать
 * хоть часик )
 * тдд пашет вот и гоу дальше
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CycleShift {
    private static final Logger LOG = getLogger(CycleShift.class);

    private final int[] arr;

    public CycleShift(final int[] values) {
        this.arr = values;
    }

    public int[] shift(int shift) {
        int tmp;
        int x = 0;
        int length = arr.length;
        while (x < shift) {
            tmp = arr[length - 1];
            for (int i = length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = tmp;
            x++;
        }
        return arr;
    }
}
