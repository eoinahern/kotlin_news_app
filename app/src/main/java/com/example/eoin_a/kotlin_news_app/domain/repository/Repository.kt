package com.example.eoin_a.kotlin_news_app.domain.repository

import rx.Observable

/**
 * Created by eoin_a on 05/01/2017.
 * generic repo interface
 *
 */

public interface Repository<T> {
    fun  getItemList() : Observable<List<T>>
}
