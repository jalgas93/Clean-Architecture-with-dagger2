package com.usecases

import com.models.Article
import com.models.NewsModel

import com.repositories.RemoteRepo
import io.reactivex.Single
import javax.inject.Inject

class GetShareDetailsUseCase @Inject constructor(val repo:RemoteRepo):SingleUseCase<NewsModel> {
    override fun execute(): Single<NewsModel> {
        return repo.getShareDetails()
    }

}