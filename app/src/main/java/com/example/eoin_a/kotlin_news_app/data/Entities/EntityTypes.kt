package com.example.eoin_a.kotlin_news_app.data.Entities

import java.net.URL

/**
 * Created by eoin_a on 05/01/2017.
 *
 * json represen tation from each API may vary slightly!!!
 */


data class NewsSource(var status : String, var sourcelist : List<NewsSourceItem>)
data class NewsSourceItem(var id : String, var name : String, var category : String, var  description : String , var country : String)

data class newsArticle(var status : String, var source: String, var articleList: List<ArticleItem>)

data class ArticleItem(var author : String, var title : String, var description : String, var url : String
,var urlToImage : String, var publishedAt : String)

