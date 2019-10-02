package com.example.kts.rest.spring.resources

import com.example.kts.rest.spring.model.Profile
import com.example.kts.rest.spring.repository.ProfileRepository
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
class ProfileResource (private val repository: ProfileRepository){

    private val log = LoggerFactory.getLogger(ProfileResource::class.java)

    @GetMapping("/api/profiles")
    fun getAll() : Iterable<Profile>{
        log.info("entering in method getAll")
        log.info("coming find all repository profile....")
        var output = repository.findAll()
        log.info("result $output")
        return output
    }

    @PostMapping("/api/post/profile")
    fun postProfile(@RequestBody requestBody : Profile) : Profile{
        log.info("entering in method postProfile")
        log.info("coming save new profile....")
        log.info("profile $requestBody")
        return repository.save(requestBody)
    }

    @DeleteMapping("/api/delete/profile/{id}")
    fun deleteProfile(@PathVariable(value= "id") id : Long){
        log.info("entering in method deleteProfile")
        log.info("coming delete a profile by id....")
        log.info("profile id: $id")
        return repository.deleteById(id)
    }

}