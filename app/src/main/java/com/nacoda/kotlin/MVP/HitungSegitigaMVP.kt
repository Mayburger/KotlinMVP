package com.nacoda.kotlin.MVP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.nacoda.kotlin.R
import kotlinx.android.synthetic.main.activity_kotlin.*

class HitungSegitigaMVP : AppCompatActivity(), PresenterView {

    override fun Hasil(nilai: String) {
        Toast.makeText(this, "" + nilai, Toast.LENGTH_LONG).show()
    }

    var presenter: Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        etNilaiSatu.hint = "Tinggi"
        etNilaiDua.hint = "Luas"

        btnHitung.setOnClickListener({
            presenter?.  HitungSegitiga(etNilaiSatu.text.toString(), etNilaiDua.text.toString())

        })
    }

    override fun onStart() {
        super.onStart()
        presenter = Presenter(this)
    }
}
