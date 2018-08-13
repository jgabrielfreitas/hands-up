package com.jgabrielfreitas.handsup.activity.introduction

import agency.tango.materialintroscreen.SlideFragment

interface IntroContract {

    interface IntroPresenterInterface {

        fun prepareSlides()

    }

    interface IntroViewInterface {

        fun addSlidesFragments(fragments: List<SlideFragment>)

    }
}