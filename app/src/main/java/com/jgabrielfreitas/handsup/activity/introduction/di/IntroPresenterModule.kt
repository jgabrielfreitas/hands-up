package com.jgabrielfreitas.handsup.activity.introduction.di

import agency.tango.materialintroscreen.SlideFragment
import com.jgabrielfreitas.handsup.activity.introduction.IntroContract
import com.jgabrielfreitas.handsup.activity.introduction.IntroPresenter
import com.jgabrielfreitas.handsup.base.BaseContract
import dagger.Module
import dagger.Provides

@Module
class IntroPresenterModule(val view: IntroContract.View, val slides: MutableList<SlideFragment>) {

    @Provides
    fun providePresenter(): BaseContract.Presenter {
        return IntroPresenter(this.view, slides)
    }

}