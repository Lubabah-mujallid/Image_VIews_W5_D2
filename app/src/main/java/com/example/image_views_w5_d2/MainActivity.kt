package com.example.image_views_w5_d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.image_views_w5_d2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)//change to your biv
        setContentView(binding.root)
    }

    fun b1(view: View) { binding.imageView.setImageResource(R.drawable.xxc) }
    fun b2(view: View) { binding.imageView.setImageResource(R.drawable.sd) }
}