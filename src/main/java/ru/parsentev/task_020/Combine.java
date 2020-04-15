package ru.parsentev.task_020;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;


public class Combine {
    private static final Logger LOG = getLogger(Combine.class);

    private final int[] values;
    public List<List<Integer>> lists = new ArrayList<>();

    public Combine(final int[] values) {
        this.values = values;
    }

    public void init() {
        int n = values.length;
        printAllRecursive(n);
    }

    public List<List<Integer>> generate() {
        init();
        return lists;
    }

    private void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public void printAllRecursive(int n) {
        if (n == 1) {
            printArray();
        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(n - 1);
                if (n % 2 == 0) {
                    swap(values, i, n - 1);
                } else {
                    swap(values, 0, n - 1);
                }
            }
            printAllRecursive(n - 1);
        }
    }

    private void printArray() {
        List<Integer> list = new ArrayList<>();
        System.out.print('\n');
        for (int i = 0; i < values.length; i++) {
//            System.out.print(values[i]);
            list.add(values[i]);
        }
        lists.add(list);
    }
}
