package com.nacoda.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nacoda.kotlin.MVP.HitungPersegiMVP
import com.nacoda.kotlin.MVP.HitungPersegiPanjangMVP
import com.nacoda.kotlin.MVP.HitungSegitigaMVP
import kotlinx.android.synthetic.main.activity_kotlin.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSegitiga.setOnClickListener({
            startActivity(Intent(this, HitungSegitigaMVP::class.java))
        })

        btnPersegi.setOnClickListener({
            startActivity(Intent(this, HitungPersegiMVP::class.java))
        })

        btnPersegiPanjang.setOnClickListener({
            startActivity(Intent(this, HitungPersegiPanjangMVP::class.java))
        })

    }
}
