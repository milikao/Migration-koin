package com.example.migrationkoin.dagger

import org.koin.core.KoinComponent
import org.koin.core.inject
import javax.inject.Inject

class ProfileInteractorDagger @Inject constructor() : KoinComponent{
    val profileInteractor: LoginInteractor by inject()

}