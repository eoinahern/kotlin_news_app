package com.example.eoin_a.kotlin_news_app.domain.UseCases

import rx.Observable
import rx.Scheduler
import rx.Subscriber
import rx.Subscription

/**
 * Created by eoin_a on 04/01/2017.
 */


public abstract class UseCase<T>(var subscriber : Subscriber<T>, var mainsched : Scheduler,
                                 var offmainsched : Scheduler)
{


    var sub : Subscription? = null

    /**
     * execute specific usecase
     *
    **/

    public fun execute(){

      sub  = buildObservable()
                .observeOn(mainsched)
                .subscribeOn(offmainsched)
                .subscribe(subscriber)

    }

    public fun dispose()
    {
        if( !sub?.isUnsubscribed!! && sub != null)
            sub?.unsubscribe()
    }

    public abstract fun buildObservable() : Observable<T>
}
