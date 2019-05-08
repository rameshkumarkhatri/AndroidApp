package com.app.androidapp.viewmodel

import androidx.lifecycle.ViewModel
import com.app.androidapp.model.Post
import io.reactivex.Single

class PostVIewModel : ViewModel() {

    fun getDataServer() : Single<List<Post>> {

//        return Single.fromCallable()
        return  Single.fromCallable{emptyList<Post>()}
    }


}