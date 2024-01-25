package com.kibong.refactoring_study.divergent._25_move_function;

import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void bankCharge() {
        Account account = new Account(5, new AccountType(true));
        assertEquals(14.5, account.getBankCharge());

        account = new Account(8, new AccountType(true));
        assertEquals(15.35, account.getBankCharge());

        account = new Account(8, new AccountType(false));
        assertEquals(18.5, account.getBankCharge());
    }

}