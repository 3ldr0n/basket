package org.basket.repository

import org.basket.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserEntity, Long> {
    override fun findAll() : List<UserEntity>
}