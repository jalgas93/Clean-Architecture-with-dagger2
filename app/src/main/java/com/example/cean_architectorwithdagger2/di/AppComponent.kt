package com.example.cean_architectorwithdagger2.di

import android.app.Application
import com.example.cean_architectorwithdagger2.CleanCodeSampleApplication
import com.example.di.ApiModule
import com.example.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityBindingModule::class,
        ApiModule::class,
        AppModule::class,
        NetworkModule::class,
        AndroidSupportInjectionModule::class,
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: CleanCodeSampleApplication)

}