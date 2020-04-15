package ru.parsentev.task011;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class ArrayContainsOneTest {
    @Test
    public void onlyOne() {
        ArrayContainsOne array = new ArrayContainsOne(new int[] {1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(true));
    }

    @Test
    public void notOnlyOne() {
        ArrayContainsOne array = new ArrayContainsOne(new int[] {1, 1, 0});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(false));
    }
}