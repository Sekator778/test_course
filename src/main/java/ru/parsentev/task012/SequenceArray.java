package ru.parsentev.task012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class SequenceArray {
    private static final Logger LOGGER = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        int count = 0;
        boolean rsl = false;
        for (int x : values
             ) {
            if (x == 1) {
                count++;
                if (count == 3) {
                    rsl = true;
                    break;
                }
            }
        }
       return rsl;
    }
}
