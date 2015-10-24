package ru.easyjava.java.accounts;

import org.junit.Test;
import ru.easyjava.java.users.User;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testChainedSetters() {
        User user = new User();

        /**
         * This line will not compile.
         */
        //user.setId(1L).setName("TEST");

        user.setId(1L);
        user.setName("TEST");

        Account testedObject = new Account();
        testedObject.setId(1L).setOwner(user).setAmount(BigDecimal.ONE);

        assertThat(testedObject.getId(), is(1L));
        assertThat(testedObject.getOwner(), is(user));
        assertThat(testedObject.getAmount(), is(BigDecimal.ONE));
    }

    @Test(expected = NullPointerException.class)
    public void cantSetNullOwner() {
        Account testedObject = new Account();
        testedObject.setId(1L).setOwner(null).setAmount(BigDecimal.ONE);
    }
}