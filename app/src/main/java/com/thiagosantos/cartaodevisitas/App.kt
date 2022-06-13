package com.thiagosantos.cartaodevisitas

import android.app.Application
import com.thiagosantos.cartaodevisitas.data.AppDataBase
import com.thiagosantos.cartaodevisitas.data.CartaoVisitaRepository

class App: Application() {

    val dataBase by lazy { AppDataBase.getDataBase(this) }
    val repository by lazy { CartaoVisitaRepository(dataBase.cartaoDao()) }
}