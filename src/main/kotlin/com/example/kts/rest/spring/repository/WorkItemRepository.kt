package com.example.kts.rest.spring.repository

import com.example.kts.rest.spring.model.WorkItem
import org.springframework.data.repository.CrudRepository

interface WorkItemRepository : CrudRepository<WorkItem, String> {
}