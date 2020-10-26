package com.codinginflow.imagesearch.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.codinginflow.imagesearch.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

/**
 * File created by by vidyesh churi on 10/25/2020 10:12 PM
 */
@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getSearchResults(query: String) = Pager(
        config =
        PagingConfig(
            pageSize = 20,
            maxSize = 100,
            enablePlaceholders = false
        ),
        pagingSourceFactory =
        {
            UnsplashPagingSource(unsplashApi, query)
        }
    ).liveData
}