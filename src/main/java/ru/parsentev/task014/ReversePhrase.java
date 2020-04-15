package ru.parsentev.task014;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ReversePhrase {
    private static final Logger LOGGER = getLogger(ReversePhrase.class);
    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder();
        String[] strings = line.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
