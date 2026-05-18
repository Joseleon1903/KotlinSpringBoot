package com.example.kts.rest.spring.resources

import com.example.kts.rest.spring.model.Profile
import com.example.kts.rest.spring.model.WorkItem
import com.example.kts.rest.spring.repository.WorkItemRepository
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WorkItemResource(private val repository: WorkItemRepository) {

    private val log = LoggerFactory.getLogger(WorkItemResource::class.java)

    @PostMapping("/api/post/workitem")
    fun postWorkItem(@RequestBody requestBody : WorkItem) : WorkItem {
        log.info("entering in method postProfile")
        log.info("coming save new profile....")
        log.info("profile $requestBody")
        return repository.save(requestBody)
    }

    @GetMapping("/api/workitem")
    fun getAll() : Iterable<WorkItem>{
        log.info("entering in method getAll")
        log.info("coming find all repository profile....")
        var output = repository.findAll()
        log.info("result $output")
        return output
    }

}