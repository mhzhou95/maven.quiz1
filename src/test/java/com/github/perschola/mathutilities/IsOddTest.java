package com.github.perschola.mathutilities;

import com.github.perschola.MathUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/6/2020.
 */
public class IsOddTest {
    // given
    private void test(Integer value, Boolean expected) {
        MathUtilities mathUtilities = new MathUtilities();

        // when
        Boolean actual = mathUtilities.isEven(value);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(0, true);
    }

    @Test
    public void test1() {
        test(1, false);
    }

    @Test
    public void test2() {
        test(2, true);
    }

    @Test
    public void test3() {
        test(138091983, false);
    }
}
