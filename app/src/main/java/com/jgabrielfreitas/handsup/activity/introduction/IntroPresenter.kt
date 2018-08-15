package com.jgabrielfreitas.handsup.activity.introduction

import agency.tango.materialintroscreen.SlideFragment
import android.os.Bundle
import com.jgabrielfreitas.handsup.base.PresenterImpl

class IntroPresenter constructor(val view: IntroContract.View,
                                 val slides: MutableList<SlideFragment>) : PresenterImpl() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view.addSlidesFragments(slides)
    }

}