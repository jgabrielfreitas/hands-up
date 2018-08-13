package com.jgabrielfreitas.handsup.activity.introduction

import com.jgabrielfreitas.handsup.activity.introduction.IntroContract.*
import agency.tango.materialintroscreen.MaterialIntroActivity
import agency.tango.materialintroscreen.SlideFragment
import android.os.Bundle
import com.jgabrielfreitas.handsup.R
import com.jgabrielfreitas.handsup.activity.introduction.di.DaggerIntroComponent
import com.jgabrielfreitas.handsup.activity.introduction.di.IntroPresenterModule
import javax.inject.Inject

class IntroductionActivity : MaterialIntroActivity(), View {

    @Inject
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerIntroComponent.builder()
                            .introPresenterModule(IntroPresenterModule(this))
                            .build()
                            .inject(this)
        presenter.prepareSlides()
    }

    override fun addSlidesFragments(fragments: List<SlideFragment>) {
        fragments.forEach { fragment -> addSlide(fragment) }
    }
}
