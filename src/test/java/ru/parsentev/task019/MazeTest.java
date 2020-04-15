package ru.parsentev.task019;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task002.Point;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class MazeTest {
    @Test
    public void singleSolution() {
        Maze maze = new Maze(
                new int[][]{
                        {1, 0, 0},
                        {1, 1, 1},
                        {0, 0, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(2, 2));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(1, 0),
                                new Point(1, 1),
                                new Point(1, 2),
                                new Point(2, 2)
                        )
                )
        );
    }

    @Test
    public void multiSolutions() {
        Maze maze = new Maze(
                new int[][]{
                        {1, 1, 1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1, 0, 1},
                        {1, 0, 0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(5, 6));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(1, 0),
                                new Point(2, 0),
                                new Point(3, 0),
                                new Point(4, 0),
                                new Point(5, 0),
                                new Point(5, 1),
                                new Point(5, 2),
                                new Point(5, 3),
                                new Point(5, 4),
                                new Point(5, 5),
                                new Point(5, 6)
                        )
                )
        );
    }
}