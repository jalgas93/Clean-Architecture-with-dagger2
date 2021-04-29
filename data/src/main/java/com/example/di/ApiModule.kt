package com.example.di

import com.example.apiService.ApiService
import com.example.mappers.ShareMapper
import com.example.repo.RemoteRepoImpl

import com.repositories.RemoteRepo
import com.usecases.GetShareDetailsUseCase
import dagger.Lazy
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ApiModule {


    @Provides
    @Named("ApiService")
    fun bindApiService(retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }


@Singleton
@Provides
    fun ProvidesGetShareDetailsUseCase(remoteRepo: RemoteRepo):GetShareDetailsUseCase{
        return GetShareDetailsUseCase(remoteRepo)
    }


    @Provides
    fun provideRemoteRepo (apiService: ApiService,): RemoteRepo {
        return RemoteRepoImpl(apiService,dagger.Lazy { ShareMapper() })
    }

    @Provides
    fun provideShareMapper():ShareMapper{
        return ShareMapper()
    }


}