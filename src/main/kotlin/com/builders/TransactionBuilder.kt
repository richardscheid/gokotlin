package com.builders

import com.models.Transaction

class TransactionBuilder {
    private var transaction = Transaction(0,0)

    fun type(type: Int): TransactionBuilder {
        this.transaction.type = type;
        return this
    }

    fun amount(amount: Int): TransactionBuilder {
        this.transaction.amount = amount;
        return this
    }

    fun build(): Transaction = this.transaction
}