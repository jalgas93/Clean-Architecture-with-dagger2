package com.example.cean_architectorwithdagger2.di

import com.example.cean_architectorwithdagger2.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun bindMainScreenActivity(): MainActivity
}