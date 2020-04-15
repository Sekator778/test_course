package ru.parsentev.task_009;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        Set<Character> set = new HashSet<>();
        char[] input = line.toCharArray();
        for (Character ch : input
             ) {
            set.add(ch);
        }
        return set.size();
    }
}
