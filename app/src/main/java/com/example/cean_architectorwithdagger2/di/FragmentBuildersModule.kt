package com.example.cean_architectorwithdagger2.di

import com.example.cean_architectorwithdagger2.ui.presentation.firstFragment.FrontFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
@ContributesAndroidInjector
abstract fun contrebutesFrontFragment():FrontFragment
}