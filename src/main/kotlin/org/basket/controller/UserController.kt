package org.basket.controller

import org.basket.entity.UserEntity
import org.basket.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    lateinit var userRepository : UserRepository;

    @GetMapping("/users")
    fun getUsers() : List<UserEntity> {
        return userRepository.findAll()
    }

    @PostMapping("/user")
    fun createUser(@RequestParam name : String) : String {
        userRepository.save(UserEntity(null, name))
        return "User created"
    }
}