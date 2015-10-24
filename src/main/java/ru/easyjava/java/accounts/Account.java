package ru.easyjava.java.accounts;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import ru.easyjava.java.users.User;

import java.math.BigDecimal;

/**
 * Sample account entity.
 */
public class Account {
    /**
     * Id.
     */
    @Getter
    @Setter
    private Long id;

    /**
     * Account owner.
     */
    @NonNull
    @Getter
    @Setter
    private User owner;

    /**
     * Account's value.
     */
    @Getter
    @Setter
    private BigDecimal amount;
}
