package com.example.cean_architectorwithdagger2

import android.app.Application
import android.content.Context
import com.example.cean_architectorwithdagger2.di.AppComponent
import com.example.cean_architectorwithdagger2.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import io.reactivex.Scheduler
import javax.inject.Inject

class CleanCodeSampleApplication:Application(),HasAndroidInjector {

@Inject
lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>




    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        AppInjector.init(this)

    }

    override fun androidInjector() = dispatchingAndroidInjector


}