package com.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager_1.databinding.ItmeViewPagerBinding
import com.utils.Data

class ViewPagerAdapter(var list :List<Data>):RecyclerView.Adapter<ViewPagerAdapter.VH>() {
    inner class VH (var itmeViewPagerBinding: ItmeViewPagerBinding):RecyclerView.ViewHolder(itmeViewPagerBinding.root){
    fun onBind(data: Data){
        itmeViewPagerBinding.title.text = data.title
        itmeViewPagerBinding.description.text = data.description
        itmeViewPagerBinding.image.setImageResource(data.image)
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItmeViewPagerBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }
}