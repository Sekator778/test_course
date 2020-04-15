package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

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
