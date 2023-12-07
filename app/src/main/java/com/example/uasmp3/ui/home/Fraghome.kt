package com.example.uasmp3.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uasmp3.MainActivity
import com.example.uasmp3.R
import com.example.uasmp3.databinding.FragmenthomeBinding

class Fraghome : Fragment() {
    private lateinit var binding: FragmenthomeBinding
    private lateinit var recyclerViewAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmenthomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        recyclerViewAdapter = CategoryAdapter(createCategoryList())
        recyclerView.adapter = recyclerViewAdapter
    }

    private fun createCategoryList(): List<Category> {
        val categoryList = mutableListOf<Category>()
        categoryList.add(Category(R.drawable.yoga, "Yoga"))
        categoryList.add(Category(R.drawable.gym, "Gym"))
        categoryList.add(Category(R.drawable.cardio, "Cardio"))
        categoryList.add(Category(R.drawable.stretch, "Strecth"))
        categoryList.add(Category(R.drawable.yoga, "Full Body"))

        return categoryList
    }

}