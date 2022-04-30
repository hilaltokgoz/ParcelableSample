package com.h.dene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.h.dene.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private val args:SecondFragmentArgs by navArgs()
    private var _binding: FragmentSecondBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            textView3.text = args.book.bookName
            textViewAuthor.text = args.book.authorName
            textViewPublisher.text = args.book.publisher
            textViewPrice.text = args.book.price.toString()
        }
    }

}