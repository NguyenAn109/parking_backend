package com.parking.exception;

import org.springframework.security.core.AuthenticationException;

public class AccountNotFoundException extends AuthenticationException {
    public AccountNotFoundException(String msg) {
        super(msg);
    }

    public AccountNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
