package com.example.migrationkoin.dagger

import javax.inject.Inject

class LoginPresenter @Inject constructor(
    private val loginInteractor: LoginInteractor,
    private val loginView: LoginView
) {

    fun login() {
        loginView.sucessLogin(loginInteractor.login())
    }
}