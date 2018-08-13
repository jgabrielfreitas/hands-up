package com.jgabrielfreitas.handsup.activity.introduction.di

import com.jgabrielfreitas.handsup.activity.introduction.IntroContract
import com.jgabrielfreitas.handsup.activity.introduction.IntroPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class IntroPresenterModule(val view: IntroContract.View) {

    @Provides
    fun providePresenter(): IntroContract.Presenter {
        return IntroPresenter(this.view)
    }

}