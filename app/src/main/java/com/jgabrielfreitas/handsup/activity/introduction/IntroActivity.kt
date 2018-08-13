package com.jgabrielfreitas.handsup.activity.introduction

import com.jgabrielfreitas.handsup.activity.introduction.IntroContract.*
import agency.tango.materialintroscreen.MaterialIntroActivity
import agency.tango.materialintroscreen.SlideFragment
import android.os.Bundle

class IntroActivity : MaterialIntroActivity(), IntroViewInterface {

    lateinit var presenter: IntroPresenterInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.prepareSlides()
    }

    override fun addSlidesFragments(fragments: List<SlideFragment>) {
        fragments.forEach { fragment -> addSlide(fragment) }
    }
}
