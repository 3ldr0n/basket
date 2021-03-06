package org.basket.entity

import org.basket.vo.FileVO
import java.time.LocalDate
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "file")
data class FileEntity(
    @Column(name = "name")
    val name: String,

    @Column(name = "path")
    val path: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uploader")
    val uploader: UserEntity,

    @Column(name = "upload_date")
    val uploadDate: LocalDate = LocalDate.now()
) {
    @Id
    @Column(name = "file_id")
    val id: UUID = UUID.randomUUID()

    fun mapToVo() : FileVO {
        val uploaderVO = uploader.mapToVo()
        return FileVO(name, path, uploaderVO, uploadDate)
    }
}