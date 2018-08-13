package com.jgabrielfreitas.handsup.activity.introduction

import agency.tango.materialintroscreen.SlideFragment
import agency.tango.materialintroscreen.SlideFragmentBuilder
import android.Manifest.permission.ACCESS_FINE_LOCATION
import com.jgabrielfreitas.handsup.R
import javax.inject.Inject

class IntroPresenter @Inject constructor(val view: IntroContract.View) : IntroContract.Presenter {

    fun getSlides(): List<SlideFragment> {

        val slideFragmentsList = mutableListOf<SlideFragment>()

        val helloSlideFragment = SlideFragmentBuilder().also {
            it.backgroundColor(R.color.introHelloFragment)
            it.title("Hello")
            it.description("Description 1")
            it.neededPermissions(arrayOf(ACCESS_FINE_LOCATION))
        }.build()
        slideFragmentsList.add(helloSlideFragment)

        return slideFragmentsList
    }

    override fun prepareSlides() {
        view.addSlidesFragments(getSlides())
    }
}