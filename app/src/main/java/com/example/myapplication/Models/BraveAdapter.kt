package com.example.myapplication.Models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapters.Brave
import com.example.myapplication.R

class BraveAdapter(var context: Context, var items:ArrayList<Brave>):
RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_brave,parent,false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        if (holder is StoryViewHolder){
            var brave_image=holder.brave_image
            var brave_text=holder.brave_text

            brave_image.setImageResource(item.image)
            brave_text.text=item.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var brave_image:ImageView
        var brave_text:TextView
        init {
            brave_image=view.findViewById(R.id.brave_image)
            brave_text=view.findViewById(R.id.blankets_text)
        }
    }
}