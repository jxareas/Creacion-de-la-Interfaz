package com.jonareas.peliculas.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jonareas.peliculas.R
import com.jonareas.peliculas.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private lateinit var binding : FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(inflater, container, false)

        binding.buttonClasificacion.setOnClickListener {
            findNavController().navigate(R.id.action_clasificacion)
        }

        binding.buttonGenero.setOnClickListener {
            findNavController().navigate(R.id.action_genero)
        }

        binding.buttonIdioma.setOnClickListener {
            findNavController().navigate(R.id.action_idioma)
        }

        binding.buttonNacionalidad.setOnClickListener {
            findNavController().navigate(R.id.action_nacionalidad)
        }

        binding.buttonPelicula.setOnClickListener {
            findNavController().navigate(R.id.action_pelicula)
        }

        return binding.root
    }


}