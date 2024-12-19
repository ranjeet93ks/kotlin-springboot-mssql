package com.ranjs.kotlin.springboot.mssql.repository

import com.ranjs.kotlin.springboot.mssql.entity.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface TaskRepository : JpaRepository<TaskEntity, Long>
