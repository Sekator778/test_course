package ru.parsentev.task_016;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * https://github.com/Sekator778/games_oop_javafx/blob/master/tictactoe/src/main/java/job4j/tictactoe/Logic3T.java
 * <p>
 * впадло вертикаль чекать
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class TicTacToe {
    private static final Logger log = getLogger(TicTacToe.class);

    private final int[][] values;

    public TicTacToe(final int[][] values) {
        this.values = values;
    }

    public boolean hasWinner() {
        boolean rsl = false;
        int count = 0;

        // gorizontal
        for (int x[] : values) {
            for (int k : x
            ) {
                if (k == 1) {
                    count++;
                }
                if (count == 3) {
                    rsl = true;
                }
            }
            count = 0;
        }
        // vertical
        for (int i = 0; i < values[0].length; i++) {
            if (values[i][i] == 1) {
                count++;
                if (count == 3) {
                    rsl = true;
                }
            }
            count = 0;
        }
        // diagonal
        int k = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[k][k] == 1) {
                k++;
                count++;
            }
           if(count == 3) {
               rsl = true;
           }
        }
        return rsl;
    }
}
