package com.example.superherolist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.superherolist.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superHeroItemResponse: SuperHeroItemResponse){
        binding.tvSuperheroName.text = superHeroItemResponse.name
    }
}