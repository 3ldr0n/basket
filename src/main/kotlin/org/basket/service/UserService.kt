package org.basket.service

import mu.KotlinLogging
import org.basket.entity.UserEntity
import org.basket.repository.UserRepository
import org.basket.vo.UserVO
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    private val logger = KotlinLogging.logger {}

    fun getUsers() : List<UserVO?> {
        val users = userRepository.findAll()
        val usersVO = ArrayList<UserVO?>()

        users.forEach {
            usersVO.add(it.mapToVo())
        }

        return usersVO
    }

    fun createUser(name : String, email : String, password : String) : Map<String, UUID> {
        val user = UserEntity(name, email, password)
        userRepository.save(user)

        logger.info("User registered: $user")

        val response = HashMap<String, UUID>()
        response["userId"] = user.id

        return response
    }
}
