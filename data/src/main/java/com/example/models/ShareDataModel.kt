package com.example.models

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import com.models.Article
import com.models.Source
@Entity
data class ShareDataModel(
    @SerializedName("status")
    var status: String?, // ok
    @SerializedName("totalResults")
    var totalResults: Int, // 15302
    @SerializedName("articles")
    var articles: List<Article>?
    )