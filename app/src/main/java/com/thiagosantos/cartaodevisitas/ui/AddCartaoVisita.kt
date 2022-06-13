package com.thiagosantos.cartaodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thiagosantos.cartaodevisitas.databinding.ActivityAddCartaoVisitaBinding


class AddCartaoVisita : AppCompatActivity() {

    private lateinit var binding: ActivityAddCartaoVisitaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddCartaoVisitaBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}