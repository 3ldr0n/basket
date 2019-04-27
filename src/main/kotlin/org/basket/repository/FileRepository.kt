package org.basket.repository

import org.basket.entity.FileEntity
import org.springframework.data.repository.CrudRepository

interface FileRepository : CrudRepository<FileEntity, Long> {
    override fun findAll() : List<FileEntity>
}