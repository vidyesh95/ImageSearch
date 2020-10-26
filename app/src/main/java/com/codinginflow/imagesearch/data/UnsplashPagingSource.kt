package com.codinginflow.imagesearch.data

import androidx.paging.PagingSource
import com.codinginflow.imagesearch.api.UnsplashApi
import retrofit2.HttpException
import java.io.IOException

/**
 * File created by by vidyesh churi on 10/26/2020 10:24 PM
 */

private const val UNSPLASH_STARTING_PAGE_INDEX = 1

class UnsplashPagingSource(
    private val unsplashApi: UnsplashApi,
    private val query: String
) : PagingSource<Int, UnsplashPhoto>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UnsplashPhoto> {
        val position = params.key ?: UNSPLASH_STARTING_PAGE_INDEX

        return try {
            val response = unsplashApi.searchPhotos(query, position, params.loadSize)
            val photos = response.results

            LoadResult.Page(
                data = photos,
                prevKey =
                if (position == UNSPLASH_STARTING_PAGE_INDEX) {
                    null
                } else {
                    position - 1
                },
                nextKey =
                if (photos.isEmpty()) {
                    null
                } else {
                    position + 1
                }
            )
        } catch (exception: IOException) {
            /*Thrown when no internet connection on request*/
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            /*Thrown when Server request not proccesed*/
            LoadResult.Error(exception)
        }
    }
}