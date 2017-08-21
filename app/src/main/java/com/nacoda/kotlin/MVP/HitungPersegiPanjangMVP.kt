package com.nacoda.kotlin.MVP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.nacoda.kotlin.R
import kotlinx.android.synthetic.main.activity_kotlin.*

class HitungPersegiPanjangMVP : AppCompatActivity(), PresenterView {

    override fun Hasil(nilai: String) {
        Toast.makeText(this, "" + nilai, Toast.LENGTH_LONG).show()
    }

    var presenter: Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        etNilaiSatu.hint = "Panjang"
        etNilaiDua.hint = "Lebar"

        btnHitung.setOnClickListener({
            presenter?.HitungPersegiPanjang(etNilaiSatu.text.toString(), etNilaiDua.text.toString())
        })
    }

    override fun onStart() {
        super.onStart()
        presenter = Presenter(this)
    }
}
