package com.jgabrielfreitas.handsup.activity.introduction

import agency.tango.materialintroscreen.MaterialIntroActivity
import agency.tango.materialintroscreen.SlideFragment
import agency.tango.materialintroscreen.SlideFragmentBuilder
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.os.Bundle
import com.jgabrielfreitas.handsup.R
import com.jgabrielfreitas.handsup.activity.introduction.IntroContract.View
import com.jgabrielfreitas.handsup.activity.introduction.di.DaggerIntroductionComponent
import com.jgabrielfreitas.handsup.activity.introduction.di.IntroPresenterModule
import com.jgabrielfreitas.handsup.base.BaseContract
import javax.inject.Inject


class IntroductionActivity : MaterialIntroActivity(), View {

    @Inject
    lateinit var presenter: BaseContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableLastSlideAlphaExitTransition(true);

        DaggerIntroductionComponent.builder()
                .introPresenterModule(IntroPresenterModule(this, provideIntroSlidesFragment()))
                .build()
                .inject(this)
        presenter.onCreate(savedInstanceState)
    }

    override fun addSlidesFragments(fragments: List<SlideFragment>) {
        fragments.forEach { fragment -> addSlide(fragment) }
    }

    fun provideIntroSlidesFragment(): MutableList<SlideFragment> {
        return mutableListOf<SlideFragment>().apply {
            add(welcomeSlide())
            add(askLocationPermissionSlide())
        }
    }

    fun welcomeSlide(): SlideFragment {
        return SlideFragmentBuilder()
                .title(resources.getString(R.string.welcome_title))
                .description(resources.getString(R.string.welcome_description))
                .backgroundColor(R.color.introHelloFragment)
                .buttonsColor(R.color.colorAccent)
                .build()
    }

    fun askLocationPermissionSlide(): SlideFragment {
        return SlideFragmentBuilder()
                .title(resources.getString(R.string.ask_permission_title))
                .description(resources.getString(R.string.ask_permission_description))
                .backgroundColor(R.color.colorPrimary)
                .neededPermissions(arrayOf(ACCESS_FINE_LOCATION))
                .buttonsColor(R.color.colorAccent)
                .build()
    }
}
