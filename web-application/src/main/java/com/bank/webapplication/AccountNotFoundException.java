package com.bank.webapplication;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    String accountNumber;

    public AccountNotFoundException(String accountNumber) {
        super();
        this.accountNumber = accountNumber;
    }

}
