package com.app.androidapp

import com.app.androidapp.model.Model
import com.google.gson.JsonObject
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
//import com.app.androidapp.model.User;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private  lateinit var user : Model.User;
    @Before
    public fun setUp() {
        user =  Model.User(10, "Bob", "Bob Master", JsonObject())
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkUser(){
        assertEquals("Bob", user.first_name);
        assertNotNull(user);
        assertSame(Model.User(10, "Bob", "Bob Master", JsonObject()), user)
    }

    @After
    public fun destroy()
    {

    }

}
