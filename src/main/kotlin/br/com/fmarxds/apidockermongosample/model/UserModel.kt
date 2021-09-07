package br.com.fmarxds.apidockermongosample.model

import org.springframework.data.annotation.Id

data class UserModel(

    @Id
    val id: String?,
    val name: String,
    val email: String,

)
