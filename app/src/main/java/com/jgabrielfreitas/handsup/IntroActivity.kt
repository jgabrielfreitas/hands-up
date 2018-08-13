package com.jgabrielfreitas.handsup

import agency.tango.materialintroscreen.MaterialIntroActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class IntroActivity : MaterialIntroActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
    }
}
