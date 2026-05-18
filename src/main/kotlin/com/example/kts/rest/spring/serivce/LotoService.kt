package com.example.kts.rest.spring.serivce

class LotoService {



    fun generarNumerosUnicos(cantidad: Int): List<Int> {
        require(cantidad <= 100) {
            "No se pueden generar más de 100 números únicos entre 1 y 100"
        }
        return (1..100).shuffled().take(cantidad)
    }

}