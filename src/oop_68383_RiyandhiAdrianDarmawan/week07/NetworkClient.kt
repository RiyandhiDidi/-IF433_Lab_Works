package oop_68383_RiyandhiAdrianDarmawan.week07

class NetworkClient private constructor(val baseUrl: String) {

    companion object {
        fun create(baseUrl: String): NetworkClient {
            return NetworkClient(baseUrl)
        }
    }
}
