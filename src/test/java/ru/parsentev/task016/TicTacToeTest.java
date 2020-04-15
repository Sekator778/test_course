package ru.parsentev.task016;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class TicTacToeTest {
    @Test
    public void hasWinner() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 0, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(true));
    }

    @Test
    public void hasNotWinner() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 0, 1},
                        {1, 0, 0},
                        {0, 1, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(false));
    }

    @Test
    public void hasHaveHorizontal() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 0, 1},
                        {0, 0, 0},
                        {1, 1, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(true));
    }
}