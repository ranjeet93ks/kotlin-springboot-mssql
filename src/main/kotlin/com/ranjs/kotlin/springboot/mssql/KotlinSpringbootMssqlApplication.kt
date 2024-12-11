package com.ranjs.kotlin.springboot.mssql

import com.ranjs.kotlin.springboot.mssql.dto.TaskDTORequest
import com.ranjs.kotlin.springboot.mssql.dto.TaskDTOResponse
import com.ranjs.kotlin.springboot.mssql.entity.TaskEntity
import com.ranjs.kotlin.springboot.mssql.repository.TaskRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class KotlinSpringbootMssqlApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringbootMssqlApplication>(*args)
}


