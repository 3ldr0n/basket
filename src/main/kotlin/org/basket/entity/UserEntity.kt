package org.basket.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.basket.vo.UserVO
import java.util.*
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
data class UserEntity(
    @Column(name = "name")
    val name: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String
) {
    @Id
    @Column(name = "user_id")
    val id: UUID = UUID.randomUUID()

    @OneToMany(
        mappedBy = "uploader",
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    val uploadedFiles: List<FileEntity> = emptyList()

    fun mapToVo() : UserVO {
        return UserVO(name, email, password)
    }
}
