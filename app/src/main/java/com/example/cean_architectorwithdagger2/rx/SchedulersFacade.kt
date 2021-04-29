package com.example.cean_architectorwithdagger2.rx

import com.example.cean_architectorwithdagger2.CleanCodeSampleApplication
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.Schedulers.io
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SchedulersFacade @Inject constructor() : SchedulersProvider {
    override fun ui(): Scheduler {
        return Schedulers.io()
    }

    override fun io(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

    override fun computing(): Scheduler {
        return Schedulers.computation()
    }
}