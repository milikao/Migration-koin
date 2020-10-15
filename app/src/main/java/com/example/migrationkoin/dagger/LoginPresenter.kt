package com.example.migrationkoin.dagger

import org.koin.core.KoinComponent
import org.koin.core.inject
import javax.inject.Inject

class LoginPresenter @Inject constructor(
    private val loginView: LoginView,
    val profileInteractorDagger: ProfileInteractorDagger
)  {

    fun login() {
        profileInteractorDagger.profileInteractor.analytics.chameianalytics()
        loginView.sucessLogin(profileInteractorDagger.profileInteractor.login())

    }
}