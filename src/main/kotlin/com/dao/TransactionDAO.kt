package com.dao

import com.models.Transaction
import org.springframework.data.mongodb.repository.MongoRepository

interface TransactionDAO: MongoRepository<Transaction, String>