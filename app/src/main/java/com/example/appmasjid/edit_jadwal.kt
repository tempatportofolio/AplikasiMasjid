package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_edit_jadwal.*
import org.json.JSONArray

class edit_jadwal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_jadwal)

        val context=this


        updsbh.setOnClickListener {
            var jdwal_sbh=sbh.text.toString()
            upsbh(jdwal_sbh)
            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }



        btn12.setOnClickListener {
            intent = Intent(context,jadwal::class.java)
            startActivity(intent)
            finish()
        }

        upddzh.setOnClickListener {
            var jdwal_dzh=dzhr.text.toString()
            updzh(jdwal_dzh)

            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        updasr.setOnClickListener {
            var jdwal_asr=asr.text.toString()
            updasar(jdwal_asr)

            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        updmrb.setOnClickListener {
            var jdwal_mrb=mrb.text.toString()
            updmrib(jdwal_mrb)

            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        updisa.setOnClickListener {
            var jdwal_isa=isa.text.toString()
            updisya(jdwal_isa)

            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        upddha.setOnClickListener {
            var jdwal_dh=duha.text.toString()
            upddh(jdwal_dh)

            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun upsbh(sbh:String) {
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-jadwal.php")
            .addBodyParameter("shubuh", sbh)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })
    }

    fun updzh(dzhr:String){
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-dzuhur.php")
            .addBodyParameter("dhuhur", dzhr)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })
    }

    fun updasar(asr:String){
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-ashar.php")
            .addBodyParameter("ashar", asr)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })

    }
    fun updmrib(mrb:String){
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-maghrib.php")
            .addBodyParameter("maghrib", mrb)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })

    }
    fun updisya(isa:String){
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-isa.php")
            .addBodyParameter("isha", isa)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })

    }
    fun upddh(duha:String){
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-dhuha.php")
            .addBodyParameter("dhuha", duha)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })

    }
}
