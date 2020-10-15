package com.example.migrationkoin.dagger

import org.koin.core.KoinComponent
import org.koin.core.inject
import javax.inject.Inject

class LoginInteractor @Inject constructor() : KoinComponent {
    val api: Api by inject()

    fun login() = api.login()

}