package com.travelgram.travelgram

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TravelgramApplication

// This service should be calling instagram endpoints and authenticate
fun main(args: Array<String>) {
    runApplication<TravelgramApplication>(*args)
}
