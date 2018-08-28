package com.travelgram.travelgram.instagram

import javax.persistence.*

@Entity
class Instagram {
    // Map /Users/tomasz.borys/dev/priv/travelgram/src/main/resources/static/media-recent-tag-query.json to represent content
    // save to local DB
    @Id
    val id: Long = -1
//    val user: = {}
//    val images: String = {}
    val created_time: String = ""
//    val caption: String = {}
    val user_has_liked: Boolean = false
//    val likes: = {}
//    val tags: = []
    val filter: String =""
//    val comments: = {}
    val type: String = ""
    val link: String = ""
//    val users_in_photo: = []

    val tags: List<String>? = null

    override fun toString(): String {
        return "Insta"
    }
}