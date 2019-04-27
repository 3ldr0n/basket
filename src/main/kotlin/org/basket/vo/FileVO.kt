package org.basket.vo

import java.time.LocalDate

data class FileVO(
    val name: String,
    val path: String,
    val uploader: UserVO,
    val uploadDate: LocalDate
)