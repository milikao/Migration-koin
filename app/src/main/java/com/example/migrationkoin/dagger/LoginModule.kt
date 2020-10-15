package com.example.migrationkoin.dagger

import dagger.Module
import dagger.Provides

@Module
class LoginModule (private val loginView: LoginView){


    @Provides
    fun provideView() = loginView
}