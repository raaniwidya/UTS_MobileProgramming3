package com.example.uasmp3.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uasmp3.R

class CategoryAdapter(private val categories: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_list, parent, false)
        return CategoryViewHolder(view)
    }


    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.categoryImage.setImageResource(category.imageResource)
        holder.categoryText.text = category.text
    }

    override fun getItemCount(): Int = categories.size

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage: ImageView = itemView.findViewById(R.id.categoryImage)
        val categoryText: TextView = itemView.findViewById(R.id.categoryText)
    }
}