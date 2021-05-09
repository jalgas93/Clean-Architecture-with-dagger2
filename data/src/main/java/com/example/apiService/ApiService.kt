package com.example.apiService

import com.example.models.ShareDataModel
import com.models.NewsModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    //

    companion object {
        const val ENDPOINT = "https://newsapi.org"
    }

    @GET("https://newsapi.org/v2/everything?q=bitcoin&apiKey=5919fcd4c1cf4755a863882751c9b9e0")
    fun getSharingDetails(
//        @Header("Authorization") token: String,
//        @Query("q") query: String
    ): Single<ShareDataModel>
}
////