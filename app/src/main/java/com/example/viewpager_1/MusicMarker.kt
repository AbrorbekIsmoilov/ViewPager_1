package com.example.viewpager_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adapters.MusicAdapter
import com.example.viewpager_1.databinding.ActivityMusicMarkerBinding
import com.utils.MyData

class MusicMarker : AppCompatActivity() {
    val binding by lazy { ActivityMusicMarkerBinding.inflate(layoutInflater) }
    lateinit var musicAdapter: MusicAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_marker)
        MyData.axborotlod()
        musicAdapter = MusicAdapter(MyData.lists)
        binding.viewPager2.adapter = musicAdapter
    }
}