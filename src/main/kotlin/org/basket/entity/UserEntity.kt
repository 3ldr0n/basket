package org.basket.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.basket.vo.UserVO
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id: Long = 0

    @OneToMany(
        mappedBy = "uploader",
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    val files: List<FileEntity> = emptyList()


    fun mapToVo() : UserVO {
        return UserVO(name, email, password)
    }
}
