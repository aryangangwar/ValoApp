package com.example.valorantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_second.*

class second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        more_details_button.setOnClickListener {
            val intent= Intent(this,Third_part2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_from_bottom_2,R.anim.anim_from_bottom_2)
        }
        val from_right= AnimationUtils.loadAnimation(this,R.anim.anim_from_right)
        val from_left= AnimationUtils.loadAnimation(this,R.anim.anim_from_left)
        val from_bottom= AnimationUtils.loadAnimation(this,R.anim.anim_from_bottom)
        val from_top= AnimationUtils.loadAnimation(this,R.anim.anim_from_top)
        second_backarrow.startAnimation(from_top)
        second_reyna.startAnimation(from_left)
        second_describe.startAnimation(from_bottom)
        more_details_button.startAnimation(from_bottom)
        more_details.startAnimation(from_bottom)


    }
}