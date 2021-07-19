package com.example.valorantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third_part2.*

class Third_part2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_part2)
        third_button_back.setOnClickListener {
            val intent=Intent(this,second_activity::class.java)
            startActivity(intent)
        }
        button_abilities.setOnClickListener {
            Toast.makeText(this,"WILL BE ADDED SOON \n KROTEX" ,Toast.LENGTH_LONG).show()
        }
        val set_animation_card = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom_3)
        val set_animation_head = AnimationUtils.loadAnimation(this, R.anim.anim_from_top_3)
        val set_animation_search=AnimationUtils.loadAnimation(this,R.anim.anim_from_left_3)
        third_button_back.startAnimation(set_animation_head)
        imageView2.startAnimation(set_animation_head)
        third_about.startAnimation(set_animation_search)
        about_body.startAnimation(set_animation_card)
        button_abilities.startAnimation(set_animation_card)
        }
    }