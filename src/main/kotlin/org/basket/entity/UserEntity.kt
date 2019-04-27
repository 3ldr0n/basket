package org.basket.entity

import org.basket.vo.UserVO
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Column

@Entity
@Table(name = "BASKET_USER")
data class UserEntity(
    @Column(name = "BASKET_USER_NAME")
    val name: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BASKET_USER_ID")
    val id: Long = 0

    fun mapToVo() : UserVO {
        return UserVO(name)
    }
}