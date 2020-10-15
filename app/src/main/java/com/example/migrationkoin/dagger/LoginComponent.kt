package com.example.migrationkoin.dagger

import com.example.migrationkoin.MainActivity
import dagger.Component

@Component(modules = [LoginModule::class])
interface LoginComponent {
    fun inject(mainActivity: MainActivity)
}