package com.milon.news.model

data class countryList(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)