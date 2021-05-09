package com.example.cean_architectorwithdagger2.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cean_architectorwithdagger2.rx.SchedulersProvider
import com.models.Article
import com.models.NewsModel

import com.usecases.GetShareDetailsUseCase
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val shareUseCase: GetShareDetailsUseCase,
    val schedulers: SchedulersProvider
) : ViewModel() {
    val shareLiveDate = MutableLiveData<NewsModel>()
    protected val compositeDisposable = CompositeDisposable()

    fun getShareData() {
        shareUseCase.execute()
            .subscribeOn(schedulers.ui())
            .subscribe({
                it?.let {
                    shareLiveDate.postValue(it)
                    Log.i("jalgas1",it.articles.toString())
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