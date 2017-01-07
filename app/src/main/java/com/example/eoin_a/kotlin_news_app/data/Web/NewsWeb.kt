package com.example.eoin_a.kotlin_news_app.data.Web

import com.example.eoin_a.kotlin_news_app.data.Entities.NewsSourceItem
import retrofit2.http.GET
import rx.Observable

/**
 * Created by eoin_a on 04/01/2017.
 * need to pull from numerous open news apis
 */

 var API_KEY: String = "8e121b45ea20473785c77c1596ffc598"
 var MAIN_ENDPOINT: String = "https://newsapi.org/v1/"


public interface NewsApi{

 @GET("sources?language=en")
 fun getNewsSources() : Observable<List<NewsSourceItem>>


 @GET("")
 fun getNewsArticles() :

}










