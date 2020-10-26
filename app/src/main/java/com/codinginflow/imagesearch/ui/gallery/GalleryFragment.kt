package com.codinginflow.imagesearch.ui.gallery

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.codinginflow.imagesearch.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * Code written by by vidyesh churi on 10/16/2020 12:35 PM
 */
@AndroidEntryPoint
class GalleryFragment : Fragment(R.layout.fragment_gallery) {

    private val viewModel by viewModels<GalleryViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.photos.observe(viewLifecycleOwner) {

        }
    }
}