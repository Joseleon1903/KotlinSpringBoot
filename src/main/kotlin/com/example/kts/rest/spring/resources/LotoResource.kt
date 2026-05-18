package com.example.kts.rest.spring.resources

import com.example.kts.rest.spring.serivce.LotoService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


data class TextoRequest(
    val contenido: String
)

@RestController
class LotoResource {

    private val log = LoggerFactory.getLogger(LotoResource::class.java)

    @GetMapping("/api/loto/{quantity}")
    fun generateWishNumber(@PathVariable("quantity") quantity : Int) : List<Int>{
        log.info("entering in method generateWishNumber")
        var output = LotoService().generarNumerosUnicos(quantity)
        log.info("result $output")
        return output
    }

    @PostMapping(
        "/api/loto/generar-txt",
        produces = ["text/plain"]
    )
    fun generarTxt(@RequestBody input: TextoRequest): ResponseEntity<ByteArray> {

        val archivoBytes = input.contenido.toByteArray(Charsets.UTF_8)

        return ResponseEntity.ok()
            .header(
                HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=archivo.txt"
            )
            .contentType(MediaType.TEXT_PLAIN)
            .body(archivoBytes)
    }

}