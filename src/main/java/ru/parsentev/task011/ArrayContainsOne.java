package ru.parsentev.task011;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ArrayContainsOne {
    private static final Logger LOG = getLogger(ArrayContainsOne.class);
    private final int[] values;

    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        boolean rsl = true;
        for (int x : values
             ) {
            if (x != 1) {
                rsl = false;
            }
        }
        return rsl;
    }
}
