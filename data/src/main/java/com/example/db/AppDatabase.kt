package com.example.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.models.Converters
import com.example.models.ShareDataModel

@Database(entities = [ShareDataModel::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun newsDao(): NewsDao

    companion object {
        val DATABASE_NAME: String = "news_db"
    }
}