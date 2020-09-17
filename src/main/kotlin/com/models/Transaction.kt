package com.models

import org.springframework.data.mongodb.core.mapping.Document

@Document(value="transactions")
data class Transaction(var type: Int, var amount: Int)