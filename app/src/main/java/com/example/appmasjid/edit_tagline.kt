package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_edit_tagline.*
import org.json.JSONArray

class edit_tagline : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_tagline)
        val context=this

        update3.setOnClickListener {
            var data_tagline=datatagline.text.toString()

            postkeserver(data_tagline)


            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnbck3.setOnClickListener {
            intent = Intent(context,tagline::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun postkeserver(datatagline:String)
    {
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-tagline.php")
            .addBodyParameter("isi_tagline", datatagline)
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
