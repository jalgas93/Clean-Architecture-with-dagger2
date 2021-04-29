package com.example.mappers

import com.example.models.ShareDataModel
import com.models.ShareDetailModel
import javax.inject.Inject

class ShareMapper @Inject constructor() {
    
    fun toShareDetails(shareModelServer:ShareDataModel):ShareDetailModel{
                return ShareDetailModel(
                        shareModelServer.shareMessage?:"",
                        shareModelServer.shareUrl?:"",
                        shareModelServer.source?:""
                    
                )
    }

}