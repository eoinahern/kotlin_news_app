package com.example.eoin_a.kotlin_news_app.data.Web

import com.example.eoin_a.kotlin_news_app.data.Entities.ArticleItem
import com.example.eoin_a.kotlin_news_app.data.Entities.NewsSource
import com.example.eoin_a.kotlin_news_app.data.Entities.NewsSourceItem
import com.example.eoin_a.kotlin_news_app.data.Entities.newsArticle
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Observable
import rx.functions.Func1

/**
 * Created by eoin_a on 04/01/2017.
 * need to pull from numerous open news apis
 */

 var API_KEY: String = "8e121b45ea20473785c77c1596ffc598"
 var MAIN_ENDPOINT: String = "https://newsapi.org/v1/"


public interface NewsApi{

 @GET("sources?language=en")
 fun getNewsSources() : Observable<NewsSource>


 @GET("articles")
 @Headers("X-Api_Key: 8e121b45ea20473785c77c1596ffc598")
 fun getNewsArticles(@Query ("source") source: String, @Query("sortBy") sort : String) : Observable<newsArticle>
}

class WebHelper {

  var  retrofitobj : Retrofit? = null
  var  newsapi : NewsApi? = null

  init {
    retrofitobj = Retrofit.Builder()
            .baseUrl(MAIN_ENDPOINT)
            .build()

     newsapi = retrofitobj?.create(NewsApi::class.java)
  }


  fun getSources() : Observable<List<NewsSourceItem>> {
    return  newsapi!!.getNewsSources().map { x -> x.sourcelist }
  }

 fun getArticles() : Observable<List<ArticleItem>>{
   return newsapi!!.getNewsArticles("a-paper", "latest").map { y  -> y.articleList }
 }




}










