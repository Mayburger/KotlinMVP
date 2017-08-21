package com.nacoda.kotlin.MVP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.nacoda.kotlin.R
import kotlinx.android.synthetic.main.activity_kotlin.*

class HitungPersegiMVP : AppCompatActivity(), PresenterView {

    override fun Hasil(nilai: String) {
        Toast.makeText(this, "" + nilai, Toast.LENGTH_LONG).show()
    }

    var presenter: Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        etNilaiDua.visibility = View.GONE
        etNilaiSatu.hint = "Sisi"

        btnHitung.setOnClickListener({
            presenter?.HitungPersegi(etNilaiSatu.text.toString())
        })
    }

    override fun onStart() {
        super.onStart()
        presenter = Presenter(this)
    }
}
