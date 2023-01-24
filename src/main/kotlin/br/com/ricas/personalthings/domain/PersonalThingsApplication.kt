package br.com.ricas.personalthings.domain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonalThingsApplication

fun main(args: Array<String>) {
	runApplication<PersonalThingsApplication>(*args)
}
