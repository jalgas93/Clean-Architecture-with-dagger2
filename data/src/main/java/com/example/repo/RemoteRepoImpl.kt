package com.example.repo

import com.example.apiService.ApiService
import com.example.mappers.ShareMapper
import com.models.ShareDetailModel
import com.repositories.RemoteRepo
import io.reactivex.Single
import javax.inject.Inject

class RemoteRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val shareMapper: dagger.Lazy<ShareMapper>
) :RemoteRepo{
    override fun getShareDetails(): Single<ShareDetailModel> {
        return apiService.getSharingDetails()
            .map {
                shareMapper.get().toShareDetails(it)
            }
    }
}