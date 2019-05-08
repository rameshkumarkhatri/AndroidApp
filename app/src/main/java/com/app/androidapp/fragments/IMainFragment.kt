package com.app.androidapp.fragments

interface IMainFragment {
    public fun showResult(result: Any);
    public fun showError(error: Throwable?);
}