package com.example.cean_architectorwithdagger2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cean_architectorwithdagger2.rx.SchedulersProvider
import com.models.ShareDetailModel
import com.usecases.GetShareDetailsUseCase
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val shareUseCase: GetShareDetailsUseCase,
    val schedulers: SchedulersProvider
) : ViewModel() {
    val shareLiveDate = MutableLiveData<ShareDetailModel>()
    protected val compositeDisposable = CompositeDisposable()

    fun getShareData() {
        shareUseCase.execute()
            .subscribeOn(schedulers.io())
            .subscribe({
                it?.let {
                    shareLiveDate.postValue(it)
                }
            }, {

            }).let {
                compositeDisposable.add(
                    it
                )
            }
    }

    override fun onCleared() {
        compositeDisposable.clear()
    }
}