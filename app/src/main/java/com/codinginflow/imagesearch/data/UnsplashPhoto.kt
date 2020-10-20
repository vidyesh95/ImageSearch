package com.codinginflow.imagesearch.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val title: String?,
    val description: String?,
    val url: UnsplashPhotoUrl,
    val user: UnsplashUser
) : Parcelable {
    @Parcelize
    data class UnsplashPhotoUrl(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String
    ) : Parcelable

    @Parcelize
    data class UnsplashUser(
        val username: String?,
        val name: String?
    ) : Parcelable {
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearch&utm_medium=referral"
    }
}