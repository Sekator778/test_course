package ru.parsentev.task010;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class BracketsTest {
    @Test
    public void valid() {
        Brackets brackets = new Brackets("()()()");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    @Test
    public void inValid() {
        Brackets brackets = new Brackets("(");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }
}