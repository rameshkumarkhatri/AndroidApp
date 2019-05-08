package com.app.androidapp.model

class Post {

    var id: String? = null;

    var title: String?
        set(value) {
            this.title = value;
        }
        get() {
            return title?.toUpperCase()
        };


}