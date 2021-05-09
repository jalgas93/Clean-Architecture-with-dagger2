package com.example.mappers

import androidx.room.TypeConverter
import com.example.models.Converters
import com.example.models.ShareDataModel
import com.models.Article
import com.models.NewsModel
import com.models.Source

import javax.inject.Inject

class ShareMapper @Inject constructor() {


    fun toShareDetails(shareModelServer: ShareDataModel): NewsModel {
        return NewsModel(
            shareModelServer.status,
            shareModelServer.totalResults,
            shareModelServer.articles

        )
    }

    @TypeConverter
    fun fromSource(source: Source): String? {
        return source.name

    }

    @TypeConverter
    fun toSource(name: String): Source? {
        return Source(name, name)

    }


}