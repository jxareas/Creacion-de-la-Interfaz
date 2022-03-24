package com.jonareas.peliculas.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jonareas.peliculas.R
import com.jonareas.peliculas.databinding.FragmentClasificacionBinding
import com.jonareas.peliculas.databinding.FragmentNacionalidadBinding


class ClasificacionFragment : Fragment() {

    private lateinit var binding : FragmentClasificacionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentClasificacionBinding.inflate(inflater, container, false)
        return binding.root
    }

}