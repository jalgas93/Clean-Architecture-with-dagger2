package com.models


import com.google.gson.annotations.SerializedName

data class NewsModel(
    @SerializedName("status")
    var status: String?, // ok
    @SerializedName("totalResults")
    var totalResults: Int, // 15302
    @SerializedName("articles")
    var articles: List<Article>?
)