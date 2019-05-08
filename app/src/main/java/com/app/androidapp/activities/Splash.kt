package com.app.androidapp.activities

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.lifecycle.ViewModelProviders
import com.app.androidapp.R
import com.app.androidapp.model.Post
import com.app.androidapp.viewmodel.PostVIewModel
import io.reactivex.functions.BiConsumer

class Splash : BaseActivity() {

    lateinit var postViewModel : PostVIewModel;

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.splash);
        postViewModel = ViewModelProviders.of(this).get(PostVIewModel::class.java);
        postViewModel.getDataServer().subscribe { list, error ->

        }


        callMainActivity();
    }

    fun callMainActivity() {
        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent)
    }
    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

}