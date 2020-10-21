package com.codinginflow.imagesearch.api

import com.codinginflow.imagesearch.data.UnsplashPhoto

/**
 * Code written by by vidyesh churi on 10/16/2020 2:05 PM
 */
data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)