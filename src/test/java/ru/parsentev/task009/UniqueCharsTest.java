package ru.parsentev.task009;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class UniqueCharsTest {
    @Test
    public void hasNotUnique() {
        UniqueChars unique = new UniqueChars("2+2");
        int result = unique.unique();
        assertThat(result, is(2));
    }

    @Test
    public void onlyUnique() {
        UniqueChars unique = new UniqueChars("123");
        int result = unique.unique();
        assertThat(result, is(3));
    }
}