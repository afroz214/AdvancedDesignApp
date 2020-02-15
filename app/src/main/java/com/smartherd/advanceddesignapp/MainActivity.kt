package com.smartherd.advanceddesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val game = game_fragment()
        val web = user_fragment()
        val android = setting_fragment()

        //if you wanted the app to start with game fragment the remove -> // OR you wanted the default one then its ok

        //val fragment = supportFragmentManager.beginTransaction()
        //fragment.replace(R.id.frame_layout, game)
        //fragment.commit()



        nav.setOnNavigationItemSelectedListener { item ->

            when(item.itemId){

                R.id.game_icon -> {

                    val fragment = supportFragmentManager.beginTransaction()
                    fragment.replace(R.id.frame_layout, game)
                    fragment.commit()

                    true
                }
                R.id.web_icon -> {

                    val fragment = supportFragmentManager.beginTransaction()
                    fragment.replace(R.id.frame_layout, web)
                    fragment.commit()

                    true
                }
                R.id.android_icon -> {

                    val fragment = supportFragmentManager.beginTransaction()
                    fragment.replace(R.id.frame_layout, android )
                    fragment.commit()

                    true
                }
                else -> {
                    false
                }
            }
        }


           }
       }
