package com.ddr.androidmodular

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.ddr.androidmodular.core.Constants
import com.ddr.androidmodular.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val uri = Uri.parse("kasir://report")
            startActivity(Intent(Intent.ACTION_VIEW, uri))
            finish()
        }, Constants.SPLASH_SCREEN_DELAY)
    }
}