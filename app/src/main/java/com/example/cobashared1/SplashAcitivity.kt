package com.example.cobashared1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
@Suppress("DEPRECATION")
class SplashAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_acitivity)
        Handler().postDelayed({
            val pindah = Intent(this, LoginActivity::class.java)
            startActivity(pindah)
            finish()
        }, 2000)
    }
}