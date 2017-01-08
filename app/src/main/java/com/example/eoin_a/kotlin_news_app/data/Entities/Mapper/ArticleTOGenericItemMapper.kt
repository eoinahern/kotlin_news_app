package com.example.eoin_a.kotlin_news_app.data.Entities.Mapper

import com.example.eoin_a.kotlin_news_app.domain.Entities.GenericNewsItem

/**
 * Created by eoin_a on 05/01/2017.
 * map various news article objects to generic news article
 */

 /*class ArticleTOGenericItemMapper(var newsitemlist : List<newsItem>) {

    var genericlist  = arrayListOf<GenericNewsItem>()

    public fun convert() : List<GenericNewsItem>
    {
        for(item in newsitemlist)
        {
            // check type
            if(checkNYtype(item))
                genericlist.add(convertNYTimesArticle(item as NyTimesArticle))
            else if(checkGuardian(item))
                genericlist.add(convertGuardianArticle(item as GuardianArticle))
            else if(checkUSA(item))
                genericlist.add(converUSATodayArticle(item as USATodayArticle))
        }

        return genericlist
    }

    private fun checkNYtype(item : newsItem): Boolean = item is NyTimesArticle
    private fun checkGuardian(item : newsItem): Boolean =  item is GuardianArticle
    private fun checkUSA(item : newsItem): Boolean =  item is USATodayArticle



    //depends on obj structure.

    private fun convertNYTimesArticle(nyarticle : NyTimesArticle) : GenericNewsItem
    {
       return  GenericNewsItem("ball", "balls", "balls", "balls", "Balls")
    }

    private fun convertGuardianArticle(guardianarticle: GuardianArticle) : GenericNewsItem
    {
        return  GenericNewsItem("ball", "balls", "balls", "balls", "Balls")
    }

    private fun converUSATodayArticle(usaarticle : USATodayArticle) : GenericNewsItem
    {
        return  GenericNewsItem("ball", "balls", "balls", "balls", "Balls")
    }
}*/
