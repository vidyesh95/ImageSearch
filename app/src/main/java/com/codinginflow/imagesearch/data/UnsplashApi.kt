package com.codinginflow.imagesearch.data

import retrofit2.http.Query

/**
 * Code written by by vidyesh churi on 10/16/2020 2:08 PM
 */
interface UnsplashApi {
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    )
}