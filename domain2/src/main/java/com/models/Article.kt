package com.models


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("source")
    var source: Source?,
    @SerializedName("author")
    var author: String?, // Alex Wilhelm
    @SerializedName("title")
    var title: String?, // What Square’s smashing earnings tell us about consumer bitcoin demand
    @SerializedName("description")
    var description: String?, // Today we're talking Square earnings and its bitcoin base, especially in how it relates to the results of other entities that offer bitcoin sales.
    @SerializedName("url")
    var url: String?, // http://techcrunch.com/2021/05/07/what-squares-smashing-earnings-tell-us-about-consumer-bitcoin-demand/
    @SerializedName("urlToImage")
    var urlToImage: String?, // https://techcrunch.com/wp-content/uploads/2020/05/NSussman_Techcrunch_Exchange_v3-ORNG.jpg?w=533
    @SerializedName("publishedAt")
    var publishedAt: String?, // 2021-05-07T18:17:36Z
    @SerializedName("content")
    var content: String? // Shares of Square are up more than 6% today after the American fintech company reported a staggering $5.06 billion in revenue in its Q1 2021 earnings report, far ahead of an expected tally of $3.36 bi… [+2045 chars]
)