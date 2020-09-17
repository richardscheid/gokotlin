package com.services

import com.dao.TransactionDAO
import com.models.Transaction
import org.springframework.stereotype.Service

@Service
class TransactionService(private val transactionDAO: TransactionDAO) {

    fun getAll(): List<Transaction> = transactionDAO.findAll()

}