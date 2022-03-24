package com.jonareas.peliculas.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jonareas.peliculas.R
import com.jonareas.peliculas.databinding.FragmentNacionalidadBinding


class NacionalidadFragment : Fragment() {

    private lateinit var binding : FragmentNacionalidadBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentNacionalidadBinding.inflate(inflater, container, false)
        return binding.root
    }

}