package com.repositories

import com.models.Article
import com.models.NewsModel

import io.reactivex.Single

interface RemoteRepo {


    fun getShareDetails():Single<NewsModel>
}