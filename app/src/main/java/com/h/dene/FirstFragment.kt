package com.h.dene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.h.dene.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {
    private var _binding: FragmentFirstBinding?=null
    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val book = Book("Dune", "Ithaki", "Frank Herbert", 50) //book nesnesi oluşturuldu.
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                book
            )
        )


    }

}