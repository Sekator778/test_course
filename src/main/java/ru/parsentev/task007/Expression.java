package ru.parsentev.task007;

import org.slf4j.Logger;
import ru.parsentev.task001.Calculator;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * тут урезано токо под тест жумаю нету смысла терять время
 * делаю так по приколу
 */
public class Expression {
    private static final Logger LOG = getLogger(Expression.class);

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr;
    }

    @SuppressWarnings("checkstyle:AvoidNestedBlocks")
    public double calc() {
        Calculator calc = new Calculator();
        char[] chars = expr.toCharArray();
        if (chars.length != 3) {
            throw new IllegalStateException();
        }
        String s1 = String.valueOf(chars[1]);
        double d1 = Double.parseDouble(String.valueOf(chars[0]));
        double d2 = Double.parseDouble(String.valueOf(chars[2]));
        if ("+".equals(s1)) {
            calc.add(d1, d2);
            return calc.getResult();
        }
        throw new UnsupportedOperationException();
    }
}
