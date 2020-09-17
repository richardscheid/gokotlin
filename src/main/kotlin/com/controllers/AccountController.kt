package com.controllers

import com.models.Account
import com.services.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController(val accountService: AccountService) {

    @GetMapping("/find")
    fun findAll(): List<Account> {
        return accountService.getAll()
    }
}