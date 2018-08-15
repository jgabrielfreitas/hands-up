package com.jgabrielfreitas.handsup.base

import android.os.Bundle

abstract class PresenterImpl : BaseContract.Presenter {
    override fun onCreate(savedInstanceState: Bundle?) {}

    override fun onStart() {}

    override fun onResume() {}

    override fun onPause() {}

    override fun onStop() {}

    override fun onRestart() {}
}