package ru.parsentev.task006;

import org.slf4j.Logger;
import ru.parsentev.task002.Point;

import static org.slf4j.LoggerFactory.getLogger;

public class Square {
    private static final Logger LOG = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public boolean exists() {
        double a = first.distanceTo(second);
        double b = first.distanceTo(fourth);
        double c = second.distanceTo(third);
        double d = fourth.distanceTo(third);
        return (a == b) && (a == c) && (a == d);
    }
}
