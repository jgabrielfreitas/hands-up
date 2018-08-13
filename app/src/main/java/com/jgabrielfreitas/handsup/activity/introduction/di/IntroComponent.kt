package com.jgabrielfreitas.handsup.activity.introduction.di


import com.jgabrielfreitas.handsup.activity.introduction.IntroductionActivity
import dagger.Component

@Component(modules = arrayOf(IntroPresenterModule::class))
interface IntroComponent {

    fun inject(introductionActivity: IntroductionActivity)

}
