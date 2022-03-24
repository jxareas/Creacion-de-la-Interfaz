package com.jonareas.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jonareas.peliculas.databinding.ItemClasificacionBinding
import com.jonareas.peliculas.model.Clasificacion

class ClasificacionAdapter(private val itemList : List<Clasificacion>) :
    RecyclerView.Adapter<ClasificacionAdapter.ClasificacionViewHolder>() {

    inner class ClasificacionViewHolder(private val binding: ItemClasificacionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(clasificacion: Clasificacion): Unit = binding.run {
            textViewAbreviacion.text = clasificacion.abreviacion
            textViewNombre.text = clasificacion.nombre
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClasificacionViewHolder {
       val clasificacionBinding = ItemClasificacionBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ClasificacionViewHolder(clasificacionBinding)
    }

    override fun onBindViewHolder(holder: ClasificacionViewHolder, position: Int) =
        holder.bind(itemList[position])

    override fun getItemCount(): Int = itemList.size

}