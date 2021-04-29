package com.usecases

import com.models.ShareDetailModel
import com.repositories.RemoteRepo
import io.reactivex.Single
import javax.inject.Inject

class GetShareDetailsUseCase @Inject constructor(val repo:RemoteRepo):SingleUseCase<ShareDetailModel> {
    override fun execute(): Single<ShareDetailModel> {
        return repo.getShareDetails()
    }

}