package  com.example.kts.rest.spring.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Profile(@Id @GeneratedValue val id: Long = -1, val name: String, val surname: String){


}