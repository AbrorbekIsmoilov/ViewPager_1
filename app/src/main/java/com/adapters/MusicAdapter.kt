package com.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager_1.databinding.ItmeAxborotBinding
import com.utils.Data

class MusicAdapter(val musicList: List<Data>):RecyclerView.Adapter<MusicAdapter.VH>() {
    inner class VH (var itmeAxborotBinding: ItmeAxborotBinding): RecyclerView.ViewHolder(itmeAxborotBinding.root){
        fun onBind(data: Data){
            itmeAxborotBinding.title.text = data.title
            itmeAxborotBinding.description.text = data.description
            itmeAxborotBinding.images.setImageResource(data.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItmeAxborotBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
       return musicList.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
      holder.onBind(musicList[position])
    }
}