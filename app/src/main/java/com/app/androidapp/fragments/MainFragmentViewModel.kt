package com.app.androidapp.fragments

import androidx.lifecycle.ViewModel;
import com.app.androidapp.model.Post
import com.app.androidapp.service.RetrofitFactory
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainFragmentViewModel : ViewModel() {
    lateinit var navigator: IMainFragment;
    public fun getUsersFromServer(){

        RetrofitFactory.create().getUsers(RetrofitFactory.apiKey, "1").subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ result -> navigator.showResult(result) },
                { error -> navigator.showError(error) })
    }

//    fun setNavigator(navigator: IMainFragment) {
//        this.navigator = navigator;
//    }


}
