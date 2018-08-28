package com.travelgram.travelgram.instagram

import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@PropertySource(value= "classpath:application.properties")
@RestController
class InstagramController {

    @Value("\${root.uri}")
    lateinit var root: String

    @Value("\${access_token}")
    lateinit var access_token: String

    @GetMapping("/search/{tag}")
    fun getByName(@PathVariable tag : String): Any? {

        val tagEnpoint = root + "tags/" + tag + "/media/recent/?access_token=" + access_token
        val response = RestTemplate().getForObject(tagEnpoint, Map::class.java)
        println("Entry retrieved from insta API: " + response )
        return Gson().toJson(response)
    }
}

// https://www.instagram.com/developer/authentication/
// To request authorisation code https://api.instagram.com/oauth/authorize/?client_id=CLIENT-ID&redirect_uri=REDIRECT-URI&response_type=code