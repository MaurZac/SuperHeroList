package com.example.superherolist

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(var superHeroList: List<SuperHeroDataResponse> = emptyList()) :
    RecyclerView.Adapter<SuperheroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = superHeroList.size

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val item = superHeroList[position]
    }
}