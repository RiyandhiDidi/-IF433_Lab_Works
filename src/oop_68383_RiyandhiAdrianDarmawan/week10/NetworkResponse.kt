package oop_68383_RiyandhiAdrianDarmawan.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)