package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val webCard=findViewById<CardView>(R.id.webCard)
        val cameraCard=findViewById<CardView>(R.id.CameraCard)

        webCard.setOnClickListener{
           val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://github.com/pra6hj0t")
            startActivity(intent)
        }
        cameraCard.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}