package ru.parsentev.task_008;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_001.Calculator;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Primes {
    private static final Logger LOGGER = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public List<Integer> calc() {
        List<Integer> list = new ArrayList<>();
        Calculator calculator = new Calculator();
        for (int i = 2; i <= limit; i++) {
            if (prim(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean prim(int x) {
        boolean rsl = true;
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
