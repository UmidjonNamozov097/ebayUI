package com.example.myapplication.Models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapters.Todaydeals
import com.example.myapplication.R

class TodaydealsAdapter(var context: Context, var items:ArrayList<Todaydeals>):
RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todaydeals,parent,false)
        return TodaydealsAdapter.StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        if (holder is StoryViewHolder){
            var today_image=holder.today_image
            var today_text1=holder.today_text1
            var today_text2=holder.today_text2
            var today_text3=holder.today_text3

            today_image.setImageResource(item.image)
            today_text1.text=item.title
            today_text2.text=item.title
            today_text3.text=item.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var today_image:ImageView
        var today_text1:TextView
        var today_text2:TextView
        var today_text3:TextView
        init {
            today_image=view.findViewById(R.id.today_image)
            today_text1=view.findViewById(R.id.today_text1)
            today_text2=view.findViewById(R.id.today_text2)
            today_text3=view.findViewById(R.id.today_text3)
        }
    }
}