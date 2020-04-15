package ru.parsentev;

import org.slf4j.Logger;
import ru.parsentev.task_015.CycleShift;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

/**
 *
 */

public class Test1 {

    public static void main(String[] args) {
        Test1 cycle = new Test1();
        int[][] masiv = new int[3][4];
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv[0].length; j++) {
                masiv[i][j] = 1;
            }
        }
        System.out.println("y " + masiv[0].length);
        System.out.println(Arrays.deepToString(masiv));
    }
    }