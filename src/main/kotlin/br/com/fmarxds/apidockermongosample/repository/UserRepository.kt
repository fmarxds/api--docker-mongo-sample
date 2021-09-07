package br.com.fmarxds.apidockermongosample.repository

import br.com.fmarxds.apidockermongosample.model.UserModel
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<UserModel, String>