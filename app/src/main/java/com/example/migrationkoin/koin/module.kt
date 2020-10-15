package com.example.migrationkoin.koin

import com.example.migrationkoin.dagger.Api
import org.koin.dsl.module

val appModule = module  {
    factory { Api() }
}