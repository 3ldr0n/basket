package org.basket.controller

import org.basket.response.BaseResponse
import org.basket.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/users")
    fun getUsers() : ResponseEntity<BaseResponse> {
        val users = userService.getUsers()
        val response = BaseResponse("ok")
        response.data = users

        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @PostMapping("/user")
    fun createUser(@RequestParam name : String) : ResponseEntity<BaseResponse> {
        val userData = userService.createUser(name)
        val response = BaseResponse("created")
        response.data = userData

        return ResponseEntity.status(HttpStatus.OK).body(response)
    }
}