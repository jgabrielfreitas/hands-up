package com.jgabrielfreitas.handsup.base

import android.os.Bundle

interface BaseContract {

    interface Presenter {

        fun onCreate(savedInstanceState: Bundle?)

        fun onStart()

        fun onResume()

        fun onPause()

        fun onStop()

        fun onRestart()

    }

}