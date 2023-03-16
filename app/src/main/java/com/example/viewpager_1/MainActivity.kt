package com.example.viewpager_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.core.view.setMargins
import androidx.viewpager2.widget.ViewPager2
import com.adapters.ViewPagerAdapter
import com.example.viewpager_1.databinding.ActivityMainBinding
import com.utils.Data
import com.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        MyData.loddata()
        viewPagerAdapter = ViewPagerAdapter(MyData.list)
        binding.viewPager2.adapter = viewPagerAdapter
        setupIndicators()
        setCurrentIndicator(0)
        binding.viewPager2.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        binding.materialButton.setOnClickListener {
           if ( binding.viewPager2.currentItem +1 < viewPagerAdapter.itemCount){
               binding.viewPager2.currentItem +=1
           }                  
            else{
                Intent(applicationContext,Kirish::class.java).also {
                    startActivity(it)
//                    finish()
                }
            }
        }
        binding.skipNext.setOnClickListener {
            Intent(applicationContext,Kirish::class.java).also {
                startActivity(it)
//                finish()
            }
        }
    }
    @SuppressLint("SuspiciousIndentation")
    fun setupIndicators(){
        val  indicators = arrayOfNulls<ImageView>(viewPagerAdapter.itemCount)
        val layoutParams:LinearLayout.LayoutParams = LinearLayout.LayoutParams(WRAP_CONTENT,WRAP_CONTENT)
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices) {
        indicators[i]= ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                    applicationContext,R.drawable.indicator_inactivite
                ))
                this?.layoutParams = layoutParams
            }
            binding.indicatorsContainer.addView(indicators[i])

        }
    }
    fun setCurrentIndicator(index:Int){
        val chidcount = binding.indicatorsContainer.childCount
        for (i in 0 until  chidcount){
            val imageView = binding.indicatorsContainer.get(i) as ImageView
            if (i == index){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_activite
                    ))
            }
            else{
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_inactivite
                    ))
            }
        }
    }
}