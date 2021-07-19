package com.example.valorantapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val set_animation_card = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)
        val set_animation_head = AnimationUtils.loadAnimation(this, R.anim.anim_from_top)
        val set_animation_search=AnimationUtils.loadAnimation(this,R.anim.anim_from_left)
        search_view.startAnimation(set_animation_search)
        card_1.startAnimation(set_animation_card)
        card_2.startAnimation(set_animation_card)
        card_3.startAnimation(set_animation_card)
        textView4.startAnimation(set_animation_head)
        textView3.startAnimation(set_animation_head)
        die.startAnimation(set_animation_head)
        textView.startAnimation(set_animation_head)
        textView2.startAnimation(set_animation_head)
        card_1.setOnClickListener {
            val intent=Intent(this, second_activity::class.java)
            startActivity(intent);
        }

    }
}