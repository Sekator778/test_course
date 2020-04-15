package ru.parsentev.task_017;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 *https://ru.stackoverflow.com/questions/616321/%d0%9f%d0%b5%d1%80%d0%b5%d0%b1%d0%be%d1%80-%d0%b2%d1%81%d0%b5%d1%85-%d0%b2%d0%be%d0%b7%d0%bc%d0%be%d0%b6%d0%bd%d1%8b%d1%85-%d0%b2%d0%b0%d1%80%d0%b8%d0%b0%d0%bd%d1%82%d0%be%d0%b2-%d1%80%d0%b0%d0%b7%d0%bc%d0%b5%d0%bd%d0%b0-%d1%81%d1%83%d0%bc%d0%bc%d1%8b-%d0%bd%d0%b0-%d0%bc%d0%b0%d0%bb%d0%b5%d0%bd%d1%8c%d0%ba%d0%b8%d0%b5-%d0%bc%d0%be%d0%bd%d0%b5%d1%82%d1%8b
 *мдееееееееееееееееееееееееееееееееееееееееееееееееееееееее
 * решение не мое сорян буду учить
 * @author parsentev
 * @since 28.07.2016
 */
public class CashMachine {

    private final int[] values;

    public CashMachine(final int[] values) {
        this.values = values;
        Arrays.sort(this.values);
    }

    public List<List<Integer>> exchange(int note) {
        return exchange(note, this.values[this.values.length - 1]);
    }

    private List<List<Integer>> exchange(int note, int maxCoin) {
        List<List<Integer>> result = new ArrayList<>();
        if (note == 0) {
            result.add(new ArrayList<>());
        } else {
            for (int i = this.values.length - 1; i >= 0; i--) {
                int coin = values[i];
                if (coin > note || coin > maxCoin) {
                    continue;
                }
                for (List<Integer> remain : exchange(note - coin, coin)) {
                    List<Integer> set = new ArrayList<>();
                    set.add(coin);
                    set.addAll(remain);
                    result.add(set);
                }
            }
        }
        return result;
    }

}