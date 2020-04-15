package ru.parsentev.task004;

import org.slf4j.Logger;
import ru.parsentev.task002.Point;
import ru.parsentev.task003.Triangle;

import static org.slf4j.LoggerFactory.getLogger;

public class IsoscelesTriangle extends Triangle {
    private static final Logger LOG = getLogger(IsoscelesTriangle.class);

    public IsoscelesTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        double a = first.distanceTo(second);
        double b = first.distanceTo(third);
        double c = second.distanceTo(third);
        boolean isExist = super.exists();
        return (a == b) || (b == c) || (a == c) && isExist;
    }
}
