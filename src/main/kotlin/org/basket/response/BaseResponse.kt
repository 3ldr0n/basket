package org.basket.response

class BaseResponse(private val message: String) {
    private lateinit var data: Any

    fun setData(data: Any) {
        this.data = data
    }
}