package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo")
class DemoController(
    private val repo: DemoRepository,
) {
    @GetMapping("/all")
    fun getAll(): List<DemoUser> =
        repo.findAll()

    @GetMapping("/admin")
    fun getAdminsOnly(): List<DemoUser> =
        repo.findByIsAdmin(true)

    @PutMapping
    fun createOrUpdate(@RequestBody user: DemoUser) {
        repo.save(user)
    }
}
