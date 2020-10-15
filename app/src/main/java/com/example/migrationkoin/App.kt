package com.example.migrationkoin

import android.app.Application
import com.example.migrationkoin.koin.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Koin Android logger
            //inject Android context
            androidContext(this@App)
            // use modules
            modules(appModule)
        }
    }
}