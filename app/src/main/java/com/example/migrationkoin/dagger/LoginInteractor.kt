package com.example.migrationkoin.dagger

import org.koin.core.KoinComponent
import org.koin.core.inject
import javax.inject.Inject

class LoginInteractor : KoinComponent {
    @Inject
    lateinit var analytics: Analytics

    val api: Api by inject()
    fun login() = api.login()


    fun qualquercoisa() = analytics.chameianalytics()

}