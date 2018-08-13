package com.jgabrielfreitas.handsup.activity.introduction

import agency.tango.materialintroscreen.SlideFragment

interface IntroContract {

    interface Presenter {

        fun prepareSlides()

    }

    interface View {

        fun addSlidesFragments(fragments: List<SlideFragment>)

    }
}