package com.controllers

import com.models.Transaction
import com.services.TransactionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("transaction")
class TransactionController(val transactionService: TransactionService) {

    @GetMapping("/find")
    fun findAll(): List<Transaction> = transactionService.getAll()

}