package com.example.migrationkoin.koin

import com.example.migrationkoin.dagger.Api
import com.example.migrationkoin.dagger.LoginInteractor
import org.koin.dsl.module

val appModule = module {
    factory { Api() }
    factory { LoginInteractor() }
}