package org.basket.controller

import org.basket.response.BaseResponse
import org.basket.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FileController {

    @Autowired
    private lateinit var fileService: FileService

    @GetMapping("/files")
    fun getFiles() : ResponseEntity<BaseResponse> {
        val response = BaseResponse("ok")
        response.data = fileService.getFiles()
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }
}