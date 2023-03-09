package com.posegym.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PoseGymApiApplication

fun main(args: Array<String>) {
    runApplication<PoseGymApiApplication>(*args)
}
