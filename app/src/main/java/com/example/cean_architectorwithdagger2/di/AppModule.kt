package com.example.cean_architectorwithdagger2.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.cean_architectorwithdagger2.CleanCodeSampleApplication
import com.example.cean_architectorwithdagger2.rx.SchedulersFacade
import com.example.cean_architectorwithdagger2.rx.SchedulersProvider
import com.example.db.AppDatabase
import com.example.db.NewsDao
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application):Context

    @Binds
    abstract fun providerScheduler(schedulerFacade: SchedulersFacade): SchedulersProvider

//    @Singleton
//    @Provides
//    @Named("auth_token")
//    fun provideToken(): String {
//        return "key 45230dcfb2e26bd8ee3eae3ff16e2064"
//    }


//    @Singleton
//    @Provides
//    fun provideDb(app: CleanCodeSampleApplication): AppDatabase {
//        return Room
//            .databaseBuilder(app, AppDatabase::class.java, AppDatabase.DATABASE_NAME)
//            .fallbackToDestructiveMigration()
//            .build()
//    }
//
//    @Singleton
//    @Provides
//    fun provideRecipeDao(db: AppDatabase): NewsDao{
//        return db.newsDao()
//    }

}