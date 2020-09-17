package com.models

import org.springframework.data.mongodb.core.mapping.Document

@Document(value="accounts")
data class Account(var balance: Int?)