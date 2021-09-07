package br.com.fmarxds.apidockermongosample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiDockerMongoSampleApplication

fun main(args: Array<String>) {
	runApplication<ApiDockerMongoSampleApplication>(*args)
}
