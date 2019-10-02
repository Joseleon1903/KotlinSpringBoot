package  com.example.kts.rest.spring.repository

import org.springframework.data.repository.CrudRepository
import com.example.kts.rest.spring.model.Profile

interface ProfileRepository : CrudRepository<Profile, Long> {



}