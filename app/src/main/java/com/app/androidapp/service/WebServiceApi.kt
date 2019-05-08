package com.app.androidapp.service

import com.app.androidapp.model.Model
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface WebServiceApi {

    @GET("users")
    fun getUsers(@Query("api_key") apkiKey: String,@Query("page") page: String) : Observable<Model.Users>;



}

