package com.example.myapplication1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recycleradepter(private val Azker: List<azker>) :RecyclerView.Adapter<recycleradepter.azkerview>() {
    class azkerview(item:View):RecyclerView.ViewHolder(item){
        val imagevie:ImageView = item.findViewById(R.id.image)
        val text:TextView = item.findViewById(R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): azkerview {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.azkermoring,parent,false)
        return azkerview(v)
    }

    override fun onBindViewHolder(holder: azkerview, position: Int) {
        val  postion = Azker[position]
        holder.imagevie.setImageResource( postion.image)
        holder.text.text =postion.text
    }

    override fun getItemCount() = Azker.size

}