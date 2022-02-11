package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapters.Brave
import com.example.myapplication.Adapters.Todaydeals
import com.example.myapplication.Models.BraveAdapter
import com.example.myapplication.Models.TodaydealsAdapter

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initViewTodayDeals()
        initViewBrave()
    }

    fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
        var manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(manager)
        refreshAdapter(getFavorites())
    }
    fun initViewTodayDeals(){
        recyclerView = findViewById(R.id.recyclerView2)
        var manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.setLayoutManager(manager)
        refreshAdapterTodayDeals(getTodaydeals())
    }
    fun initViewBrave(){
        recyclerView = findViewById(R.id.recyclerView3)
        var manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.setLayoutManager(manager)
        refreshAdapterBrave(getBrave())
    }

    fun refreshAdapter(favorites: ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this, favorites)
        recyclerView!!.adapter = adapter
    }
    fun refreshAdapterTodayDeals(todaydealss: ArrayList<Todaydeals>){
        val adapter = TodaydealsAdapter(this,todaydealss)
        recyclerView!!.adapter=adapter
    }

    fun refreshAdapterBrave(brave: ArrayList<Brave>){
        val adapter=BraveAdapter(this,brave)
        recyclerView!!.adapter=adapter
    }

    fun getFavorites(): ArrayList<Favorite> {
        val favorites = ArrayList<Favorite>()
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        favorites.add(Favorite("Watch", R.drawable.watch))
        return favorites
    }
    fun getTodaydeals(): ArrayList<Todaydeals> {
        val todaydeals = ArrayList<Todaydeals>()
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        todaydeals.add(Todaydeals("Watch", R.drawable.watch))
        return todaydeals
    }
    fun getBrave(): ArrayList<Brave> {
        val braves = ArrayList<Brave>()
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        braves.add(Brave("Watch", R.drawable.watch))
        return braves
    }
}