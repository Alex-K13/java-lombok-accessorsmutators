package ru.easyjava.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Factorial16UtilTest {
    private Factorial16Util testedObject = new Factorial16Util();

    public void testFirstCall() {
        assertThat(testedObject.getFactorial16(), is(new BigDecimal(20922789888000L)));
    }

    @Test(timeout = 1L)
    public void testSecondCall() {
        assertThat(testedObject.getFactorial16(), is(new BigDecimal(20922789888000L)));
    }
}