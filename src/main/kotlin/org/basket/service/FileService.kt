package org.basket.service

import org.basket.repository.FileRepository
import org.basket.vo.FileVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FileService {

    @Autowired
    private lateinit var fileRepository: FileRepository

    fun getFiles() : List<FileVO> {
        val files = fileRepository.findAll()
        val filesVO = ArrayList<FileVO>()
        files.forEach {
            filesVO.add(it.mapToVo())
        }

        return filesVO
    }
}