package com.example.eoin_a.kotlin_news_app.presentation.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.eoin_a.kotlin_news_app.R
import com.example.eoin_a.kotlin_news_app.presentation.Entities.NewsItem

/**
 * Created by eoin_a on 04/01/2017.
 */


 class TopicSelectAdapter(var topiclist :List<NewsItem>) : RecyclerView.Adapter<TopicSelectAdapter.viewholder>() {


    override fun onBindViewHolder(holder: TopicSelectAdapter.viewholder?, position: Int) {
        holder?.bindView(topiclist[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TopicSelectAdapter.viewholder {

        var v: View = LayoutInflater.from(parent?.context).inflate(R.layout.topic_select_single, parent, false)
        return viewholder(v)

    }

    override fun getItemCount(): Int  =  topiclist.count()

    class viewholder(v : View) : RecyclerView.ViewHolder(v){

        var image: ImageView? = null
        var tile: TextView? = null


        init {


        }


        public fun bindView(newsitem : NewsItem)
        {

        }
    }

}