package com.example.repo

import android.util.Log
import com.example.apiService.ApiService
import com.example.mappers.ShareMapper
import com.models.Article
import com.models.NewsModel

import com.repositories.RemoteRepo
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Named

class RemoteRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val shareMapper: dagger.Lazy<ShareMapper>,

    ) : RemoteRepo {
    override fun getShareDetails(): Single<NewsModel> {


        return apiService.getSharingDetails()
            .map {
                Log.i("jalgas2", it.toString())
                shareMapper.get().toShareDetails(it)
            }

    }
}