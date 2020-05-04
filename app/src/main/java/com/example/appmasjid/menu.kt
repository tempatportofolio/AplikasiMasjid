package com.example.appmasjid

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*

class menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val context=this

        b1.setOnClickListener {
            intent = Intent(context,jadwal::class.java)
            startActivity(intent)
            finish()
        }

        b2.setOnClickListener {
            intent = Intent(context,identitas::class.java)
            startActivity(intent)
            finish()
        }

        b3.setOnClickListener {
            intent = Intent(context,marquee::class.java)
            startActivity(intent)
            finish()
        }

        b4.setOnClickListener {
            intent = Intent(context,tagline::class.java)
            startActivity(intent)
            finish()
        }

        b5.setOnClickListener {
            intent = Intent(context,pengumuman::class.java)
            startActivity(intent)
            finish()
        }

        b6.setOnClickListener {
            intent = Intent(context,slideshow::class.java)
            startActivity(intent)
            finish()
        }

        button.setOnClickListener{
            val sharedPreferences=getSharedPreferences("CEKLOGIN", Context.MODE_PRIVATE)
            val editor=sharedPreferences.edit()

            editor.putString("STATUS","0")
            editor.apply()

            startActivity(Intent(this@menu,MainActivity::class.java))
            finish()
        }
    }
}
