package br.com.fmarxds.apidockermongosample.service

import br.com.fmarxds.apidockermongosample.model.UserModel
import br.com.fmarxds.apidockermongosample.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {

    fun findAll(): Collection<UserModel> {
        return userRepository.findAll()
    }

    fun findOne(id: String): UserModel? {
        return userRepository.findByIdOrNull(id)
    }

    fun saveOne(user: UserModel): UserModel {
        return userRepository.save(user)
    }

}