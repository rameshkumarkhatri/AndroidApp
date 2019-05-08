package com.app.androidapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {


    companion object {

        private val INTENT_USER_ID = "user_id"

//        fun newIntent(context: Context, bundle :Bundle): Intent {
//            val intent = Intent(context, UserDetailActivity::class.java)
//            intent.putExtra(INTENT_USER_ID, user.id)
//            return intent
//        }
    }
}