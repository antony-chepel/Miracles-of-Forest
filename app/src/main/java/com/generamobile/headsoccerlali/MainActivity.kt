package com.generamobile.headsoccerlali

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsoccerlali.vufrijokdf.Noosksijjixhubcsy
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val rokdskofko by viewModel<Noosksijjixhubcsy>(named("MainModel"))
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rokdskofko.ukokokotrkokookokfd(this)
    }
}