package ru.parsentev.task_005;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_002.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class RightTriangleTest {
    @Test
    public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        boolean result = new RightTriangle(first, second, third).exists();
        assertThat(result, is(true));
    }

    @Test
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        boolean result = new RightTriangle(first, second, third).exists();
        assertThat(result, is(false));
    }

    @Test
    public void notRight() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 2);
        Point third = new Point(0, 5);
        boolean result = new RightTriangle(first, second, third).exists();
        assertThat(result, is(false));
    }
}