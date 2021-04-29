package com.example.cean_architectorwithdagger2.rx

import io.reactivex.Scheduler

interface SchedulersProvider {
    fun ui (): Scheduler
    fun io (): Scheduler
    fun computing (): Scheduler
}