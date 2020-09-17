package com.builders

import com.models.Account

class AccountBuilder {
    private val account = Account(0)

    fun balance(amount: Int): AccountBuilder {
        this.account.balance = amount;
        return this;
    }

    fun build(): Account = this.account
}