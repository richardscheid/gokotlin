package models

import org.springframework.data.mongodb.core.mapping.Document

@Document data class Account(val balance: Int)