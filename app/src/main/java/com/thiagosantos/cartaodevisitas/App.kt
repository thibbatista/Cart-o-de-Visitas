package com.thiagosantos.cartaodevisitas

import android.app.Application
import com.thiagosantos.cartaodevisitas.data.AppDatabase

import com.thiagosantos.cartaodevisitas.data.BusinessCardRepository

class App : Application() {
    private val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}