package ru.easyjava.java.users;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void testClientProperties() {
        User testedObject = new User();

        testedObject.setId(1L);
        testedObject.setName("TEST");

        /**
         * Line below will not compile.
         */
        //testedObject.setCantSet(BigDecimal.ONE)

        assertThat(testedObject.getId(), is(1L));
        assertThat(testedObject.getName(), is("TEST"));
        assertThat(testedObject.getCantSet(), is(BigDecimal.TEN));
    }
}