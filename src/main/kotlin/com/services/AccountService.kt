package com.services

import com.dao.AccountDAO
import com.models.Account
import org.springframework.stereotype.Service

@Service
class AccountService(private val accountDAO: AccountDAO) {

    fun getAll(): List<Account> = accountDAO.findAll()
}