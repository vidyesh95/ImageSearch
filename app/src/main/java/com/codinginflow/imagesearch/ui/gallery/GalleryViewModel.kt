package com.codinginflow.imagesearch.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.codinginflow.imagesearch.data.UnsplashRepository

/**
 * File created by by vidyesh churi on 10/25/2020 11:17 PM
 */
class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {
}