package com.example.apiService

import com.example.models.ShareDataModel
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {
    //

    companion object {
        const val ENDPOINT = "https://www.androidapps.com/"
    }
    @GET("/share/")
    fun getSharingDetails(): Single<ShareDataModel>
}
////