package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class DemoUser(
    @Id
    var id: Int,
    var name: String,
    var isAdmin: Boolean,
)

interface DemoRepository : JpaRepository<DemoUser, Int> {
    // warning here: "Cannot resolve property 'isAdmin'"
    fun findByIsAdmin(isAdmin: Boolean): List<DemoUser>

    // this would not produce a warning. but would crash at startup
    // fun findByAdmin(admin: Boolean): List<DemoEntity>
}
