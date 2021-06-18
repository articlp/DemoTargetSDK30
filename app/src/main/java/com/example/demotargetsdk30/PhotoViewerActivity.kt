package com.example.demotargetsdk30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demotargetsdk30.databinding.ActivityPhotoViewerBinding

class PhotoViewerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPhotoViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}