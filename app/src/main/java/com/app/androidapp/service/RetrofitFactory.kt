package com.app.androidapp.service

import io.reactivex.disposables.Disposable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {


    companion object {

        val apiKey = "gYzLyHLg9ty7bHoqk2IE5jzePWiOMZ5D";

        fun create(): WebServiceApi {

            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.create())
                .addConverterFactory(
                    GsonConverterFactory.create())
                .baseUrl("http://behance.net/v2/")
                .build()

            return retrofit.create(WebServiceApi::class.java)
        }
    }

    val WebServiceApi by lazy {
        create()
    }
    var disposable: Disposable? = null
}