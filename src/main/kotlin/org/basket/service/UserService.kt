package org.basket.service

import org.basket.entity.UserEntity
import org.basket.repository.UserRepository
import org.basket.vo.UserVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun getUsers() : List<UserVO?> {
        val users = userRepository.findAll()
        val usersVO = ArrayList<UserVO?>()

        users.forEach {
            usersVO.add(it.mapToVo())
        }

        return usersVO
    }

    fun createUser(name : String) : Map<String, Long> {
        val user = UserEntity(0, name)
        userRepository.save(user)

        val response = HashMap<String, Long>()
        response["userId"] = user.id

        return response
    }
}