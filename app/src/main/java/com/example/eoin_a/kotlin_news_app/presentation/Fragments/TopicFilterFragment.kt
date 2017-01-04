package com.example.eoin_a.kotlin_news_app.presentation.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eoin_a.kotlin_news_app.R
import com.example.eoin_a.kotlin_news_app.presentation.Adapters.TopicSelectAdapter

class TopicFilterFragment : Fragment() {


    var topicadapter: TopicSelectAdapter? = null
    var lmanager : LinearLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v =  inflater?.inflate(R.layout.topic_select_fragment, container, false)
        return v
    }

    //static data for categories

    private fun setUpAdapter() {

    }




    override fun onDestroyView() {
        super.onDestroyView()
        //cleanup
    }
}
