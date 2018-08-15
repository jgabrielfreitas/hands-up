package com.jgabrielfreitas.handsup.activity.introduction

import agency.tango.materialintroscreen.SlideFragment
import com.jgabrielfreitas.handsup.base.BaseContract

interface IntroContract {

    interface Presenter: BaseContract.Presenter {

        fun prepareSlides()

    }

    interface View {

        fun addSlidesFragments(fragments: List<SlideFragment>)

    }
}