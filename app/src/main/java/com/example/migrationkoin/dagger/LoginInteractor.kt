package com.example.migrationkoin.dagger

import javax.inject.Inject

class LoginInteractor @Inject constructor(private val api: Api) {

    fun login() = api.login()

}