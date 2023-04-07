package com.milon.news.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.milon.news.DetailActivity
import com.milon.news.model.Article
import com.milon.newsapi.databinding.ItemLayoutBinding

class countryAdapter(val context: Context, val article: List<Article>): RecyclerView.Adapter<countryAdapter.coViewHolder>(){

    class coViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): coViewHolder {
        return coViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: coViewHolder, position: Int) {
        val article= article[position]
        holder.binding.textTitle.text= article.title
        holder.binding.textDescription.text=article.description
        holder.binding.root.setOnClickListener {
            var img : String = article.urlToImage
            var titleIntent= Intent(context, DetailActivity::class.java)
            titleIntent.putExtra("title", article.title)
            titleIntent.putExtra("des", article.description)
            titleIntent.putExtra("img", img)
            context.startActivity(titleIntent)
        }
        Glide.with(context).load(article.urlToImage).into(holder.binding.imageView)

    }

    override fun getItemCount(): Int {
        return article.size
    }



}