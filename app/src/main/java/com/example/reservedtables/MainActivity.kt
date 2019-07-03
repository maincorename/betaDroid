package com.example.reservedtables

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }
    fun map(view: View) {
        val map = Intent(this, reserve::class.java)
        startActivity(map)
    }
    fun info(view: View){
        val info= Intent(this,com.example.myapplication.table_info::class.java)
        startActivity(info)
    }
    
    }
