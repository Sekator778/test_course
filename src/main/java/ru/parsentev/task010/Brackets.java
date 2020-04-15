package ru.parsentev.task010;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Brackets {
    private static final Logger LOG = getLogger(Brackets.class);
    private final String line;

    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        int count1 = 0;
        int count2 = 0;
        char[] input = line.toCharArray();
        for (Character ch : input
             ) {
            if (String.valueOf(ch).equals("(")) {
                count1++;
            } else if (String.valueOf(ch).equals(")")) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
