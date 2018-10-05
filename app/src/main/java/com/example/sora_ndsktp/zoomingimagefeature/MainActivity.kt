package com.example.sora_ndsktp.zoomingimagefeature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_camera.setOnClickListener {
            val openCamIntent = Intent()
            openCamIntent.action = MediaStore.ACTION_IMAGE_CAPTURE

            createImageFile()
        }
    }
}
