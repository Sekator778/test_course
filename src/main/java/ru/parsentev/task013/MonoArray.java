package ru.parsentev.task013;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class MonoArray {
    private static final Logger LOGGER = getLogger(MonoArray.class);

    private final int[] values;

    public MonoArray(final int[] values) {
        this.values = values;
    }

    public boolean exists() {
        boolean rsl = true;
        int check = values[0];
        for (int x : values
             ) {
            if (x != check) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
