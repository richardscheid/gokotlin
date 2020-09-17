package com.dao

import com.models.Account
import org.springframework.data.mongodb.repository.MongoRepository

interface AccountDAO: MongoRepository<Account, String>