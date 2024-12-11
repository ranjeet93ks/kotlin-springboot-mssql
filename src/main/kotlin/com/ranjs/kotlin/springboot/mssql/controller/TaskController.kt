package com.ranjs.kotlin.springboot.mssql.controller

import com.ranjs.kotlin.springboot.mssql.dto.TaskDTORequest
import com.ranjs.kotlin.springboot.mssql.dto.TaskDTOResponse
import com.ranjs.kotlin.springboot.mssql.service.TaskService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*

@RestController
@RequestMapping("/tasks")
class TaskController(var taskService: TaskService) {
    @PostMapping("/create")
    fun createTask(@RequestBody newTask: TaskDTORequest): TaskDTOResponse {
        return taskService.createTask(newTask)
    }
    @GetMapping("/all")
    fun getAllTasks(): List<TaskDTOResponse>? {
        val tasks = taskService.getAllTasks()
        if (tasks != null) {
            if (tasks.isEmpty()) {
                throw ResponseStatusException(HttpStatus.NOT_FOUND, "No tasks found")
            }
        }
        return tasks
    }
    @GetMapping("/{id}")
    fun getTask(@PathVariable id: Long): TaskDTOResponse {
        return taskService.getTask(id)
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found")
    }
    @PutMapping("/{id}")
    fun updateTask(@PathVariable id: Long, @RequestBody updatedTask: TaskDTORequest): TaskDTOResponse {
        return taskService.updateTask(id, updatedTask)
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found")
    }
    @DeleteMapping("/{id}")
    fun deleteTask(@PathVariable id: Long) {
        taskService.deleteTask(id)
    }
}

