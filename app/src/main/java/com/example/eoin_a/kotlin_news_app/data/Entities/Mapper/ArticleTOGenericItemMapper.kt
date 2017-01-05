package com.example.eoin_a.kotlin_news_app.data.Entities.Mapper

import com.example.eoin_a.kotlin_news_app.data.Entities.newsItem
import com.example.eoin_a.kotlin_news_app.domain.Entities.GenericNewsItem
import kotlinx.android.synthetic.main.activity_feed.*


/**
 * Created by eoin_a on 05/01/2017.
 */

 class ArticleTOGenericItemMapper(var newsitemlist : List<newsItem>) {

    var genericlist : List<GenericNewsItem> = arrayListOf()



    public fun convert() : List<GenericNewsItem> = genericlist


    private fun convertNYTimesArticle() : GenericNewsItem
    {
       return  GenericNewsItem("ball", "balls", "balls", "balls", "Balls")
    }

    private fun convertGuardianArticle() : GenericNewsItem
    {
        return  GenericNewsItem("ball", "balls", "balls", "balls", "Balls")
    }

    private fun converUSATodayArticle() : GenericNewsItem
    {
        return  GenericNewsItem("ball", "balls", "balls", "balls", "Balls")
    }
}
