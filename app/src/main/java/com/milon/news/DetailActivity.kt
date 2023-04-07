package com.milon.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.milon.news.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var apiDetail= intent
        val imgView= binding.imageView2

        var title= apiDetail.getStringExtra("title")
        var des= apiDetail.getStringExtra("des")
        var imgage= apiDetail.getStringExtra("img")


      //  imgView.setImageResource(imgage)
        Glide.with(applicationContext).load(imgage).into(imgView)
        binding.textView.text= title
        binding.textView2.text= des
    }
}