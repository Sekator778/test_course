package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.slf4j.LoggerFactory.getLogger;

public class RightTriangle extends Triangle {
    private static final Logger LOGGER = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        double a = Math.round(Math.pow(first.distanceTo(second), 2));
        double b = Math.round(Math.pow(first.distanceTo(third), 2));
        double c = Math.round(Math.pow(second.distanceTo(third), 2));
        boolean one = false;
        boolean two = false;
        boolean three = false;
        if (a == (b + c)) {
            one = true;
        }
        if (b == (a + c)) {
            two = true;
        }
        if (c == (a + b)) {
            three = true;
        }
        boolean papa = super.exists();
        return (one || two || three) && papa;
    }
}
