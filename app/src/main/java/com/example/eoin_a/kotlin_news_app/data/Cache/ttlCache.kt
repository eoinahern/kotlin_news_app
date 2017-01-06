package com.example.eoin_a.kotlin_news_app.data.Cache

/**
 * Created by eoin_a on 05/01/2017.
 * interface. check stored data is valid!!
 */


public interface Cache{
    public fun isValid() : Boolean
}


/**
 * check news stored in db has todays date!!
 */

public class ttlCache : Cache {

    override fun isValid(): Boolean {
        throw UnsupportedOperationException("not implemented")
    }

}
