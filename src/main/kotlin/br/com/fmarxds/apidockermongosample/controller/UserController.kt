package br.com.fmarxds.apidockermongosample.controller

import br.com.fmarxds.apidockermongosample.model.UserModel
import br.com.fmarxds.apidockermongosample.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(
    value = ["/users"],
    consumes = [MediaType.APPLICATION_JSON_VALUE],
    produces = [MediaType.APPLICATION_JSON_VALUE],
)
class UserController(
    private val userService: UserService,
) {

    @GetMapping
    fun findAll(): ResponseEntity<Collection<UserModel>> {
        return ResponseEntity.ok(userService.findAll())
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable("id") id: String): ResponseEntity<UserModel> {
        return ResponseEntity.of(Optional.ofNullable(userService.findOne(id)))
    }

    @PostMapping
    fun saveOne(@RequestBody user: UserModel): ResponseEntity<UserModel> {
        return ResponseEntity(userService.saveOne(user), HttpStatus.CREATED)
    }

}