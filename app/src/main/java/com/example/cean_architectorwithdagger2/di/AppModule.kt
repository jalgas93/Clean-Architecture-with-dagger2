package com.example.cean_architectorwithdagger2.di

import android.app.Application
import android.content.Context
import com.example.cean_architectorwithdagger2.rx.SchedulersFacade
import com.example.cean_architectorwithdagger2.rx.SchedulersProvider
import dagger.Binds
import dagger.Module

@Module(includes = [ViewModelModule::class])
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application):Context

    @Binds
    abstract fun providerScheduler(schedulerFacade: SchedulersFacade): SchedulersProvider
}