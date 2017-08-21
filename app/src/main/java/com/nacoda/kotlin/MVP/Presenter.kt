package com.nacoda.kotlin.MVP

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.nacoda.kotlin.MainActivity

class Presenter {

    var presenterView: PresenterView? = null

    constructor(presenterView: PresenterView? = null) {
        this.presenterView = presenterView
    }

    fun HitungSegitiga(nilai1: String, nilai2: String) {
        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            val x = nilai1.toDouble()
            val y = nilai2.toDouble()

            val hasil = (x * y) / 2
            presenterView?.Hasil(hasil.toString())
        }
    }

    fun HitungPersegi(nilai1: String) {
        if (nilai1.isNotEmpty()) {
            val x = nilai1.toDouble()

            val hasil = Math.round(x)
            presenterView?.Hasil(hasil.toString())
        }
    }

    fun HitungPersegiPanjang(nilai1: String, nilai2: String) {
        if (nilai1.isNotEmpty()) {
            val x = nilai1.toDouble()
            val y = nilai2.toDouble()

            val hasil = x * y
            presenterView?.Hasil(hasil.toString())
        }
    }
}