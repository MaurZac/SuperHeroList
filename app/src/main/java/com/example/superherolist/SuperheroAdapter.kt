package com.example.superherolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(var superHeroList: List<SuperHeroItemResponse> = emptyList(), private val onItemSelected:(String) -> Unit) :
    RecyclerView.Adapter<SuperheroViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {

        return SuperheroViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount() = superHeroList.size

    override fun onBindViewHolder(viewholder: SuperheroViewHolder, position: Int) {
        viewholder.bind(superHeroList[position], onItemSelected)
    }

    fun updateList(superHeroList: List<SuperHeroItemResponse>){
        this.superHeroList = superHeroList
        notifyDataSetChanged()
    }
}