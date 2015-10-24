package ru.easyjava.java.users;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Sample user entity
 */
public class User {
    /**
     * Id.
     */
    @Getter
    @Setter
    private Long id;

    /**
     * User name.
     */
    @Getter
    @Setter
    private String name;

    /**
     * Some entity, that you can't set.
     */
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private BigDecimal cantSet = BigDecimal.TEN;
}
