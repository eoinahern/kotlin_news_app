package com.example.eoin_a.kotlin_news_app.data.Entities

/**
 * Created by eoin_a on 05/01/2017.
 *
 * json represen tation from each API may vary slightly!!!
 */

interface newsItem

data class NyTimesArticle(var name : String) : newsItem
data class GuardianArticle(var name : String) : newsItem
data class USATodayArticle(var name : String) : newsItem
