package com.repositories

import com.models.ShareDetailModel
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader
import io.reactivex.Single

interface RemoteRepo {
    fun getShareDetails():Single<ShareDetailModel>
}