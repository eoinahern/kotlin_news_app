package com.example.eoin_a.kotlin_news_app.data.DB

import com.example.eoin_a.kotlin_news_app.data.Entities.ArticleItem
import com.example.eoin_a.kotlin_news_app.data.Entities.NewsSourceItem
import rx.Observable

/**
 * Created by eoin_a on 04/01/2017.
 */



public interface NewsDB {

    fun getSources() : Observable<List<NewsSourceItem>>
    fun saveSources(newslist : List<NewsSourceItem>) : Unit
    fun getArticles() : Observable<List<ArticleItem>>
    fun saveArticles(articlelist: List<ArticleItem>) : Unit
}


public class NewsDBImp : NewsDB {

    override fun saveSources(newslist: List<NewsSourceItem>) {

    }

    override fun getSources(): Observable<List<NewsSourceItem>> {

    }

    override fun getArticles(): Observable<List<ArticleItem>> {

    }

    override fun saveArticles(articlelist: List<ArticleItem>) {

    }


}
