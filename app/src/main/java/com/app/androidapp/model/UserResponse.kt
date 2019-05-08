package com.app.androidapp.model

import com.google.gson.JsonObject
import org.json.JSONObject

object Model {

    data class UserResponse(val res: Users)

    data class Users(val users: List<User>)

    data class User(val id : Long, val first_name : String, val display_name : String, val images : JsonObject)


}