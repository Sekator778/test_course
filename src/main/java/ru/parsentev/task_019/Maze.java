package ru.parsentev.task_019;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;


public class Maze {

    private final int[][] values;

    public Maze(final int[][] values) {
        this.values = values;
    }

    public List<Point> solution(Point start, Point finish) {
        List<Point> result = new LinkedList<>();
        if (values[finish.getX()][finish.getY()] == 0) {
            System.out.println("finish not can be zero");
            return new ArrayList<>();
        }
        if (!solveMazeUtil(start, finish, result)) {
            System.out.print("Solution doesn't exist");
            return new ArrayList<>();
        }
        return result;
    }

    /**
     * проверяем или мы на поле и или на пути из 1
     * тут вроде напутанно с координатами !!!
     */
    private boolean isSafe(Point current) {
        int sizeY = values[0].length;
        int sizeX = values.length;
        int x = current.getX();
        int y = current.getY();
        return (x >= 0 && x < sizeX && y >= 0 && y < sizeY && values[x][y] == 1);
    }

    private boolean solveMazeUtil(Point current, Point end, List<Point> result) {

        // when point to finish
        if (current.equals(end)) {
            result.add(current);
            return true;
        }
        // when point norm ) to list
        if (isSafe(current)) {
            result.add(current);

            // move forward in to Y
            Point moveY = new Point(current.getX(), current.getY() + 1);
            if (solveMazeUtil(moveY, end, result)) {
                return true;
            }

            // move forward in to X
            Point moveX = new Point(current.getX() + 1, current.getY());
            if (solveMazeUtil(moveX, end, result)) {
                return true;
            }

            result.remove(result.size() - 1);
            return false;
        }
        return false;
    }
//
//
//    public static void main(String[] args) {
//        Maze maze = new Maze(
//                new int[][] {
//                        {1, 1, 1},
//                        {1, 0, 1},
//                        {1, 0, 1},
//                        {0, 0, 1}
//                }
//        );
//        Point start = new Point(0, 0);
//        Point finish = new Point(3, 2);
//        maze.solution(start, finish).forEach(System.out::println);
//
//    }

}
