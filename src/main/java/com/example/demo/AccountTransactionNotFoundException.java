package com.example.demo;

public class AccountTransactionNotFoundException  extends Exception {

    private int accountId;
        public  AccountTransactionNotFoundException(int accountId) {
            super(String.format("Account not found with id : '%s'", accountId));
        }
    }

